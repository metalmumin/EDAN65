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
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:36
 * @production FuncUseExpr : {@link PrimaryExpr} ::= <span class="component">&lt;ID:String&gt;</span> <span class="component">{@link Expr}*</span>;

 */
public class FuncUseExpr extends PrimaryExpr implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:172
   */
  public String prettyString() {
		String s = "";
		s += getID() +"(";
		for(int i = 0; i < getNumExpr(); ++i) {			
			s += getExpr(i).prettyString();
			if(i < getNumExpr() - 1) {
				s += ", ";
			}
		}
		s += ")";
		return s;
	}
  /**
   * @declaredat ASTNode:1
   */
  public FuncUseExpr() {
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
    children = new ASTNode[1];
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public FuncUseExpr(String p0, List<Expr> p1) {
    setID(p0);
    setChild(p1, 0);
  }
  /**
   * @declaredat ASTNode:18
   */
  public FuncUseExpr(beaver.Symbol p0, List<Expr> p1) {
    setID(p0);
    setChild(p1, 0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:31
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    decl_reset();
    type_reset();
    args_reset();
    compatibleFunctionArgumentNumber_reset();
    compatibleArgumentType_reset();
    func_String_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:43
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:49
   */
  public FuncUseExpr clone() throws CloneNotSupportedException {
    FuncUseExpr node = (FuncUseExpr) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:56
   */
  public FuncUseExpr copy() {
    try {
      FuncUseExpr node = (FuncUseExpr) clone();
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
   * @declaredat ASTNode:75
   */
  public FuncUseExpr fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:84
   */
  public FuncUseExpr treeCopyNoTransform() {
    FuncUseExpr tree = (FuncUseExpr) copy();
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
   * @declaredat ASTNode:104
   */
  public FuncUseExpr treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:111
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node)  && (tokenString_ID == ((FuncUseExpr)node).tokenString_ID);    
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /**
   * @apilevel internal
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public void setID(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * Replaces the Expr list.
   * @param list The new list node to be used as the Expr list.
   * @apilevel high-level
   */
  public void setExprList(List<Expr> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Expr list.
   * @return Number of children in the Expr list.
   * @apilevel high-level
   */
  public int getNumExpr() {
    return getExprList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Expr list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Expr list.
   * @apilevel low-level
   */
  public int getNumExprNoTransform() {
    return getExprListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Expr list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Expr list.
   * @apilevel high-level
   */
  public Expr getExpr(int i) {
    return (Expr) getExprList().getChild(i);
  }
  /**
   * Check whether the Expr list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExpr() {
    return getExprList().getNumChild() != 0;
  }
  /**
   * Append an element to the Expr list.
   * @param node The element to append to the Expr list.
   * @apilevel high-level
   */
  public void addExpr(Expr node) {
    List<Expr> list = (parent == null || state == null) ? getExprListNoTransform() : getExprList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addExprNoTransform(Expr node) {
    List<Expr> list = getExprListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Expr list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExpr(Expr node, int i) {
    List<Expr> list = getExprList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Expr list.
   * @return The node representing the Expr list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Expr")
  public List<Expr> getExprList() {
    List<Expr> list = (List<Expr>) getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Expr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expr list.
   * @apilevel low-level
   */
  public List<Expr> getExprListNoTransform() {
    return (List<Expr>) getChildNoTransform(0);
  }
  /**
   * Retrieves the Expr list.
   * @return The node representing the Expr list.
   * @apilevel high-level
   */
  public List<Expr> getExprs() {
    return getExprList();
  }
  /**
   * Retrieves the Expr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expr list.
   * @apilevel low-level
   */
  public List<Expr> getExprsNoTransform() {
    return getExprListNoTransform();
  }
  /**
   * @apilevel internal
   */
  protected boolean decl_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean decl_computed = false;
  /**
   * @apilevel internal
   */
  protected FuncIdDecl decl_value;
/**
 * @apilevel internal
 */
private void decl_reset() {
  decl_computed = false;
  decl_value = null;
  decl_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public FuncIdDecl decl() {
    if(decl_computed) {
      return decl_value;
    }
    if (decl_visited) {
      throw new RuntimeException("Circular definition of attr: decl in class: org.jastadd.ast.AST.SynDecl");
    }
    decl_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    decl_value = func(getID());
    if (true) {
      decl_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    decl_visited = false;
    return decl_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean type_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean type_computed = false;
  /**
   * @apilevel internal
   */
  protected Type type_value;
/**
 * @apilevel internal
 */
private void type_reset() {
  type_computed = false;
  type_value = null;
  type_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public Type type() {
    if(type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attr: type in class: org.jastadd.ast.AST.SynDecl");
    }
    type_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    type_value = decl().type();
    if (true) {
      type_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    type_visited = false;
    return type_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean args_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean args_computed = false;
  /**
   * @apilevel internal
   */
  protected int args_value;
/**
 * @apilevel internal
 */
private void args_reset() {
  args_computed = false;
  args_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public int args() {
    if(args_computed) {
      return args_value;
    }
    if (args_visited) {
      throw new RuntimeException("Circular definition of attr: args in class: org.jastadd.ast.AST.SynDecl");
    }
    args_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    args_value = getNumExpr();
    if (true) {
      args_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    args_visited = false;
    return args_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean compatibleFunctionArgumentNumber_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean compatibleFunctionArgumentNumber_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean compatibleFunctionArgumentNumber_value;
/**
 * @apilevel internal
 */
private void compatibleFunctionArgumentNumber_reset() {
  compatibleFunctionArgumentNumber_computed = false;
  compatibleFunctionArgumentNumber_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public boolean compatibleFunctionArgumentNumber() {
    if(compatibleFunctionArgumentNumber_computed) {
      return compatibleFunctionArgumentNumber_value;
    }
    if (compatibleFunctionArgumentNumber_visited) {
      throw new RuntimeException("Circular definition of attr: compatibleFunctionArgumentNumber in class: org.jastadd.ast.AST.SynDecl");
    }
    compatibleFunctionArgumentNumber_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    compatibleFunctionArgumentNumber_value = args() == decl().args();
    if (true) {
      compatibleFunctionArgumentNumber_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    compatibleFunctionArgumentNumber_visited = false;
    return compatibleFunctionArgumentNumber_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean compatibleArgumentType_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean compatibleArgumentType_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean compatibleArgumentType_value;
/**
 * @apilevel internal
 */
private void compatibleArgumentType_reset() {
  compatibleArgumentType_computed = false;
  compatibleArgumentType_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public boolean compatibleArgumentType() {
    if(compatibleArgumentType_computed) {
      return compatibleArgumentType_value;
    }
    if (compatibleArgumentType_visited) {
      throw new RuntimeException("Circular definition of attr: compatibleArgumentType in class: org.jastadd.ast.AST.SynDecl");
    }
    compatibleArgumentType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    compatibleArgumentType_value = compatibleArgumentType_compute();
    if (true) {
      compatibleArgumentType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    compatibleArgumentType_visited = false;
    return compatibleArgumentType_value;
  }
  /**
   * @apilevel internal
   */
  private boolean compatibleArgumentType_compute() {
  		if(!compatibleFunctionArgumentNumber())	return true;
  		boolean result = compatibleFunctionArgumentNumber(); 
  		for(int i = 0; i < args(); i++) 
  			result &= decl().func().getParam(i).getType().getType().equals( getExpr(i).type().getType());
  		return result;
  	}
  /**
   * Start lookup pattern FuncUseExpr - for(index-1)
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:109
   */
  @ASTNodeAnnotation.Attribute
  public FuncIdDecl func(String name) {
    Object _parameters = name;
    if (func_String_visited == null) func_String_visited = new java.util.HashSet(4);
    if (func_String_values == null) func_String_values = new java.util.HashMap(4);
    if(func_String_values.containsKey(_parameters)) {
      return (FuncIdDecl)func_String_values.get(_parameters);
    }
    if (func_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: func in class: org.jastadd.ast.AST.InhDecl");
    }
    func_String_visited.add(_parameters);
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    FuncIdDecl func_String_value = getParent().Define_FuncIdDecl_func(this, null, name);
    if (true) {
      func_String_values.put(_parameters, func_String_value);
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    func_String_visited.remove(_parameters);
    return func_String_value;
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set func_String_visited;
  protected java.util.Map func_String_values;
/**
 * @apilevel internal
 */
private void func_String_reset() {
  func_String_values = null;
  func_String_visited = null;
}  
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:54
   */
    if (decl().isUnknown()) {
      {
        Program ref = (Program) (program());
        if (ref != null) {
          ref.Program_errors_contributors().add(this);
        }
      }
    }
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:66
   */
    if (!compatibleFunctionArgumentNumber()) {
      {
        Program ref = (Program) (program());
        if (ref != null) {
          ref.Program_errors_contributors().add(this);
        }
      }
    }
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:70
   */
    if (!compatibleArgumentType()) {
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
    if (decl().isUnknown())
      collection.add(error("function '" + getID() + "' is not declared"));
    if (!compatibleFunctionArgumentNumber())
      collection.add(error("ERROR: incompatibleFunctionArgumentNumber in usage of function '" + prettyString() + "'"));
    if (!compatibleArgumentType())
      collection.add(error("ERROR: incompatibleArgumentType in usage of function '" + prettyString() + "'"));
  }

}
