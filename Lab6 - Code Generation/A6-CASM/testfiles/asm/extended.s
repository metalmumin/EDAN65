.global _start
.data
ask_message: .ascii "Please enter a number: "
ask_msg_len: .quad 23
buf: .skip 1024

.text
_start:
    	call main
    	movq $0, %rdi
    	movq $60, %rax
    	syscall
main:
    	pushq %rbp
    	movq %rsp, %rbp
    	subq $0, %rsp
        call f
        popq %rax
# return stmt 
        movq $0, %rax
    	movq %rbp, %rsp
    	popq %rbp
    	ret
fac:
    	pushq %rbp
    	movq %rsp, %rbp
        movq 16(%rbp), %rax
        pushq %rax
    	subq $0, %rsp
    	movq -8(%rbp), %rax 	 # put n into  %rax
        pushq %rax
        movq $1, %rax
        movq %rax, %rbx
        popq %rax
        cmpq %rbx, %rax 	 # the result of the boolean operation EQ is in %al, which resides within %rax
        jle leq_1
        jmp nleq_1
leq_1:
        movq $1, %rax
        jmp done_1
nleq_1:
        movq $0, %rax
done_1:
        cmpq $1, %rax
        jne fac_0_else_lbl # go to else_lbl if %rax < 10
fac_0_then_lbl:
        # then body
# return stmt 
        movq $1, %rax
    	movq %rbp, %rsp
    	popq %rbp
    	ret
        jmp fac_0_fi
fac_0_else_lbl:
# return stmt 
    	movq -8(%rbp), %rax 	 # put n into  %rax
        pushq %rax
        movq $1, %rax
        movq %rax, %rbx
        popq %rax
        subq %rbx, %rax
        pushq %rax
        call fac
        pushq %rax
    	movq -8(%rbp), %rax 	 # put n into  %rax
        movq %rax, %rbx
        popq %rax
        imulq %rbx, %rax
    	movq %rbp, %rsp
    	popq %rbp
    	ret
fac_0_fi:
        # done
f:
    	pushq %rbp
    	movq %rsp, %rbp
    	subq $8, %rsp

        # executing 'int u = read();'
        call read
        movq %rax, -16(%rbp)	 # move %rax to u
    	movq -16(%rbp), %rax 	 # put u into  %rax
        pushq %rax
        call fac
        pushq %rax
        call print
        popq %rax
# return stmt 
        movq $0, %rax
    	movq %rbp, %rsp
    	popq %rbp
    	ret
# Procedure to read number from stdin
# C signature: long int read(void)
read:
        pushq %rbp
        movq %rsp, %rbp
        movq $0, %rdi
        movq $buf, %rsi
        movq $1024, %rdx
        movq $0, %rax
        syscall                 # %rax = sys_read(0, buf, 1024)
        ### convert string to integer:
        ### %rax contains nchar
        ### %rsi contains ptr
        movq $0, %rdx           # sum = 0
atoi_loop:
        cmpq $0, %rax           # while (nchar > 0)
        jle atoi_done           # leave loop if nchar <= 0
        movzbq (%rsi), %rbx     # move byte, and sign extend to qword
        cmpq $0x30, %rbx        # test if < '0'
        jl atoi_done            # character is not numeric
        cmpq $0x39, %rbx        # test if > '9'
        jg atoi_done            # character is not numeric
        imulq $10, %rdx         # multiply sum by 10
        subq $0x30, %rbx        # value of character
        addq %rbx, %rdx         # add to sum
        incq %rsi               # step to next char
        decq %rax               # nchar--
        jmp atoi_loop           # loop back
atoi_done:
        movq %rdx, %rax         # return value in RAX
        popq %rbp
        ret

# Procedure to print number to stdout
# C signature: void print(long int)
print:
        pushq %rbp
        movq %rsp, %rbp
        ### convert integer to string
        movq 16(%rbp), %rax     # parameter
        movq $(buf+1023), %rsi  # write ptr (start from end of buf)
        movb $0x0a, (%rsi)      # insert newline
        movq $1, %rcx           # string length
itoa_loop:                      # do.. while (at least one iteration)
        movq $10, %rbx
        movq $0, %rdx
        idivq %rbx              # divide rdx:rax by 10
        addb $0x30, %dl         # remainder + '0'
        decq %rsi               # move string pointer
        movb %dl, (%rsi)
        incq %rcx               # increment string length
        cmpq $0, %rax
        jg itoa_loop            # produce more digits
itoa_done:
        movq $1, %rdi
        movq %rcx, %rdx
        movq $1, %rax
        syscall
        popq %rbp
        ret

print_string:
        pushq %rbp
        movq %rsp, %rbp
        movq $1, %rdi
        movq 16(%rbp), %rsi
        movq 24(%rbp), %rdx
        movq $1, %rax
        syscall
        popq %rbp
        ret
