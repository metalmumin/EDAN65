package lang;

import lang.ast.*;

/**
 * Traverses each node, passing the data to the children.
 * Returns the data unchanged.
 * Overriding methods may change the data passed and the data returned.
 */
public abstract class TraversingVisitor implements lang.ast.Visitor {

	private Object visitChildren(ASTNode node, Object data) {
		for (int i = 0; i < node.getNumChild(); ++i) {
			node.getChild(i).accept(this, data);
		}
        return data;
	}

	public Object visit(List node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(Opt node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(Program node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(FuncDecl node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(Block node, Object data){
		return visitChildren(node, data);
	}
	
	//STMT:s
	public Object visit(IfStmt node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(ReturnStmt node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(AssignStmt node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(DeclStmt node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(PrintStmt node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(WhileStmt node, Object data){
		return visitChildren(node, data);
	}
	
	public Object visit(DeclAssignStmt node, Object data){
		return visitChildren(node, data);
	}
	
	// Expr	
	public Object visit(IntLiteral node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(IdUseExpr node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(FuncUseExpr node, Object data){
		return visitChildren(node, data);
	}
//  Should not be here, should only be in .jrag - make method dependency in correct place
//	public Object visit(ReadFunc node, Object data){
//		return visitChildren(node, data);
//	}
			
	public Object visit(Mul node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(Div node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(Mod node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(Add node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(Sub node, Object data){
		return visitChildren(node, data);
	}

	
	public Object visit(GT node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(LT node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(GE node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(LE node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(EQ node, Object data){
		return visitChildren(node, data);
	}
	public Object visit(NE node, Object data){
		return visitChildren(node, data);
	}
	
	public Object visit(IdDecl node, Object data) {
		return visitChildren(node, data);
	}
//	public Object visit(List node, Object data) {
//		return visitChildren(node, data);
//	}
//	public Object visit(Opt node, Object data) {
//		return visitChildren(node, data);
//	}
//	public Object visit(Program node, Object data) {
//		return visitChildren(node, data);
//	}
//	public Object visit(Mul node, Object data) {
//		return visitChildren(node, data);
//	}
//	public Object visit(Div node, Object data) {
//		return visitChildren(node, data);
//	}
//	public Object visit(Numeral node, Object data) {
//		return visitChildren(node, data);
//	}
//	public Object visit(IdUse node, Object data) {
//		return visitChildren(node, data);
//	}
//	public Object visit(Let node, Object data) {
//		return visitChildren(node, data);
//	}
//	public Object visit(Binding node, Object data) {
//		return visitChildren(node, data);
//	}
//	public Object visit(Ask node, Object data) {
//		return visitChildren(node, data);
//	}
}
