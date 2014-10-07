/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.9 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:22
 * @production DeclAssignStmt : {@link Stmt} ::= <span class="component">{@link Type}</span> <span class="component">{@link IdDecl}</span> <span class="component">{@link Expr}</span>;

 */
public class DeclAssignStmt extends Stmt implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:94
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print("\n" + ind + "int " + getIdDecl().prettyString() + " = " + getExpr().prettyString() + ";");
	}
  /**
   * @declaredat ASTNode:1
   */
  public DeclAssignStmt() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[3];
  }
  /**
   * @declaredat ASTNode:13
   */
  public DeclAssignStmt(Type p0, IdDecl p1, Expr p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    localLookup_String_reset();
    compatibleTypes_reset();
    typeLookup_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:42
   */
  public DeclAssignStmt clone() throws CloneNotSupportedException {
    DeclAssignStmt node = (DeclAssignStmt) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:49
   */
  public DeclAssignStmt copy() {
    try {
      DeclAssignStmt node = (DeclAssignStmt) clone();
      node.parent = null;
      if(children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:68
   */
  public DeclAssignStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:77
   */
  public DeclAssignStmt treeCopyNoTransform() {
    DeclAssignStmt tree = (DeclAssignStmt) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if(child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:97
   */
  public DeclAssignStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:104
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) ;    
  }
  /**
   * Replaces the Type child.
   * @param node The new node to replace the Type child.
   * @apilevel high-level
   */
  public void setType(Type node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Type child.
   * @return The current node used as the Type child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Type")
  public Type getType() {
    return (Type) getChild(0);
  }
  /**
   * Retrieves the Type child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Type child.
   * @apilevel low-level
   */
  public Type getTypeNoTransform() {
    return (Type) getChildNoTransform(0);
  }
  /**
   * Replaces the IdDecl child.
   * @param node The new node to replace the IdDecl child.
   * @apilevel high-level
   */
  public void setIdDecl(IdDecl node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the IdDecl child.
   * @return The current node used as the IdDecl child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdDecl")
  public IdDecl getIdDecl() {
    return (IdDecl) getChild(1);
  }
  /**
   * Retrieves the IdDecl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdDecl child.
   * @apilevel low-level
   */
  public IdDecl getIdDeclNoTransform() {
    return (IdDecl) getChildNoTransform(1);
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(2);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(2);
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set localLookup_String_visited;
  protected java.util.Map localLookup_String_values;
/**
 * @apilevel internal
 */
private void localLookup_String_reset() {
  localLookup_String_values = null;
  localLookup_String_visited = null;
}  
  @ASTNodeAnnotation.Attribute
  public IdDecl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    if(localLookup_String_values.containsKey(_parameters)) {
      return (IdDecl)localLookup_String_values.get(_parameters);
    }
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: localLookup in class: org.jastadd.ast.AST.SynDecl");
    }
    localLookup_String_visited.add(_parameters);
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    IdDecl localLookup_String_value = localLookup_compute(name);
    if (true) {
      localLookup_String_values.put(_parameters, localLookup_String_value);
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    localLookup_String_visited.remove(_parameters);
    return localLookup_String_value;
  }
  /**
   * @apilevel internal
   */
  private IdDecl localLookup_compute(String name) {
  		if(getIdDecl().getID().equals(name))
  			return getIdDecl();
  		
  		return unknownDecl();
  	}
  /**
   * @apilevel internal
   */
  protected boolean compatibleTypes_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean compatibleTypes_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean compatibleTypes_value;
/**
 * @apilevel internal
 */
private void compatibleTypes_reset() {
  compatibleTypes_computed = false;
  compatibleTypes_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public boolean compatibleTypes() {
    if(compatibleTypes_computed) {
      return compatibleTypes_value;
    }
    if (compatibleTypes_visited) {
      throw new RuntimeException("Circular definition of attr: compatibleTypes in class: org.jastadd.ast.AST.SynDecl");
    }
    compatibleTypes_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    compatibleTypes_value = getIdDecl().type().isUnknownType() 		||
    			getExpr().type().isUnknownType()		||
    			getIdDecl().type().getType().equals(getExpr().type().getType());
    if (true) {
      compatibleTypes_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    compatibleTypes_visited = false;
    return compatibleTypes_value;
  }
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:25
   */
  @ASTNodeAnnotation.Attribute
  public Type typeLookup() {
    if(typeLookup_computed) {
      return typeLookup_value;
    }
    if (typeLookup_visited) {
      throw new RuntimeException("Circular definition of attr: typeLookup in class: org.jastadd.ast.AST.InhDecl");
    }
    typeLookup_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    typeLookup_value = getParent().Define_Type_typeLookup(this, null);
    if (true) {
      typeLookup_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    typeLookup_visited = false;
    return typeLookup_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean typeLookup_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean typeLookup_computed = false;
  /**
   * @apilevel internal
   */
  protected Type typeLookup_value;
/**
 * @apilevel internal
 */
private void typeLookup_reset() {
  typeLookup_computed = false;
  typeLookup_value = null;
  typeLookup_visited = false;
}  
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:67
   * @apilevel internal
   */
  public IdDecl Define_IdDecl_lookup(ASTNode caller, ASTNode child, String name) {
    if (caller == getIdDeclNoTransform()){
		IdDecl decl = localLookup(name);
		return !decl.isUnknown() ? decl : lookup(name);
	}
    else {
      return super.Define_IdDecl_lookup(caller, child, name);
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:149
   * @apilevel internal
   */
  public boolean Define_boolean_inExprOf(ASTNode caller, ASTNode child, IdDecl decl) {
    if (caller == getExprNoTransform()) {
      return getIdDecl() == decl || inExprOf(decl);
    }
    else {
      return getParent().Define_boolean_inExprOf(this, caller, decl);
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:29
   * @apilevel internal
   */
  public Type Define_Type_typeLookup(ASTNode caller, ASTNode child) {
    if (caller == getIdDeclNoTransform()) {
      return !getType().isUnknownType() ? getType() : typeLookup();
    }
    else {
      return getParent().Define_Type_typeLookup(this, caller);
    }
  }
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:62
   */
    if (!compatibleTypes()) {
      {
        Program ref = (Program) (program());
        if (ref != null) {
          ref.Program_errors_contributors().add(this);
        }
      }
    }
    super.collect_contributors_Program_errors();
  }
  protected void contributeTo_Program_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_Program_errors(collection);
    if (!compatibleTypes())
      collection.add(error("Assignment to '" + getIdDecl().type().getType() + " " + getIdDecl().getID() + "' is incompatible with type '" + getExpr().type().getType() + "'"));
  }

}
