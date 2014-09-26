package lang.ast; // The generated scanner will belong to the package lang.ast

import lang.ast.LangParser.Terminals; // The terminals are implicitly defined in the parser
import lang.ast.LangParser.SyntaxError;

%%

// define the signature for the generated scanner
%public
%final
%class LangScanner
%extends beaver.Scanner

// the interface between the scanner and the parser is the nextToken() method
%type beaver.Symbol 
%function nextToken 

// store line and column information in the tokens
%line
%column

// this code will be inlined in the body of the generated scanner class
%{
  private beaver.Symbol sym(short id) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}

// macros
WhiteSpace = [ ] | \t | \f | \n | \r
ID   = [a-zA-Z]+[a-zA-Z0-9]*
NUMERAL  = [0-9]+|([0-9]+\.[0-9]+)
COMMENT ="/*" ~"*/"

%%

// discard whitespace and multi-line comment information
{WhiteSpace}  { }
{COMMENT}	  { }

// token definitions
"return"	{ return sym(Terminals.RETURN); }
"while"		{ return sym(Terminals.WHILE); 	}
"print"		{ return sym(Terminals.PRINT);	}
"else"		{ return sym(Terminals.ELSE); 	}
"read"		{ return sym(Terminals.READ);	}
"if"		{ return sym(Terminals.IF); 	}
"int"		{ return sym(Terminals.INT); 	}
"=="		{ return sym(Terminals.EQ); 	}
"!="		{ return sym(Terminals.NE); 	}
">="		{ return sym(Terminals.GE); 	}
"<="		{ return sym(Terminals.LE); 	}
">"			{ return sym(Terminals.GT); 	}
"<"			{ return sym(Terminals.LT); 	}
"="			{ return sym(Terminals.ASSIGN); }
"*"			{ return sym(Terminals.MUL); 	}
"/"			{ return sym(Terminals.DIV); 	}
"%"			{ return sym(Terminals.MOD); 	}
"-"			{ return sym(Terminals.SUB); 	}
"+"			{ return sym(Terminals.ADD); 	}
"("			{ return sym(Terminals.LP); 	}
")"			{ return sym(Terminals.RP); 	}
";"			{ return sym(Terminals.SEMI); 	}
","			{ return sym(Terminals.COMMA); 	}
"{"			{ return sym(Terminals.LB); 	}
"}"			{ return sym(Terminals.RB); 	}
{NUMERAL}	{ return sym(Terminals.NUMERAL);}
{ID}		{ return sym(Terminals.ID); 	}
<<EOF>>		{ return sym(Terminals.EOF); 	}

/* error fallback */
[^]           { throw new SyntaxError("Illegal character <"+yytext()+">"); }
