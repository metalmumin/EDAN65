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
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:35
 * @production IdUseExpr : {@link PrimaryExpr} ::= <span class="component">&lt;ID:String&gt;</span>;

 */
public class IdUseExpr extends PrimaryExpr implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:152
   */
  public String prettyString() {
		return getID();
	}
  /**
   * @declaredat ASTNode:1
   */
  public IdUseExpr() {
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
  }
  /**
   * @declaredat ASTNode:12
   */
  public IdUseExpr(String p0) {
    setID(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public IdUseExpr(beaver.Symbol p0) {
    setID(p0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    decl_reset();
    isCircular_reset();
    type_reset();
    lookup_String_reset();
    inExprOf_IdDecl_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:44
   */
  public IdUseExpr clone() throws CloneNotSupportedException {
    IdUseExpr node = (IdUseExpr) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:51
   */
  public IdUseExpr copy() {
    try {
      IdUseExpr node = (IdUseExpr) clone();
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
   * @declaredat ASTNode:70
   */
  public IdUseExpr fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public IdUseExpr treeCopyNoTransform() {
    IdUseExpr tree = (IdUseExpr) copy();
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
   * @declaredat ASTNode:99
   */
  public IdUseExpr treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:106
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node)  && (tokenString_ID == ((IdUseExpr)node).tokenString_ID);    
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
  protected IdDecl decl_value;
/**
 * @apilevel internal
 */
private void decl_reset() {
  decl_computed = false;
  decl_value = null;
  decl_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public IdDecl decl() {
    if(decl_computed) {
      return decl_value;
    }
    if (decl_visited) {
      throw new RuntimeException("Circular definition of attr: decl in class: org.jastadd.ast.AST.SynDecl");
    }
    decl_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    decl_value = lookup(getID());
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
  protected boolean isCircular_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean isCircular_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isCircular_value;
/**
 * @apilevel internal
 */
private void isCircular_reset() {
  isCircular_computed = false;
  isCircular_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public boolean isCircular() {
    if(isCircular_computed) {
      return isCircular_value;
    }
    if (isCircular_visited) {
      throw new RuntimeException("Circular definition of attr: isCircular in class: org.jastadd.ast.AST.SynDecl");
    }
    isCircular_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    isCircular_value = inExprOf(decl());
    if (true) {
      isCircular_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    isCircular_visited = false;
    return isCircular_value;
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
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:14
   */
  @ASTNodeAnnotation.Attribute
  public IdDecl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    if(lookup_String_values.containsKey(_parameters)) {
      return (IdDecl)lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: lookup in class: org.jastadd.ast.AST.InhDecl");
    }
    lookup_String_visited.add(_parameters);
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    IdDecl lookup_String_value = getParent().Define_IdDecl_lookup(this, null, name);
    if (true) {
      lookup_String_values.put(_parameters, lookup_String_value);
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    lookup_String_visited.remove(_parameters);
    return lookup_String_value;
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set lookup_String_visited;
  protected java.util.Map lookup_String_values;
/**
 * @apilevel internal
 */
private void lookup_String_reset() {
  lookup_String_values = null;
  lookup_String_visited = null;
}  
  /**
   * @attribute inh
   * @aspect CircularDefinitions
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:147
   */
  @ASTNodeAnnotation.Attribute
  public boolean inExprOf(IdDecl decl) {
    Object _parameters = decl;
    if (inExprOf_IdDecl_visited == null) inExprOf_IdDecl_visited = new java.util.HashSet(4);
    if (inExprOf_IdDecl_values == null) inExprOf_IdDecl_values = new java.util.HashMap(4);
    if(inExprOf_IdDecl_values.containsKey(_parameters)) {
      return ((Boolean)inExprOf_IdDecl_values.get(_parameters)).booleanValue();
    }
    if (inExprOf_IdDecl_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: inExprOf in class: org.jastadd.ast.AST.InhDecl");
    }
    inExprOf_IdDecl_visited.add(_parameters);
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    boolean inExprOf_IdDecl_value = getParent().Define_boolean_inExprOf(this, null, decl);
    if (true) {
      inExprOf_IdDecl_values.put(_parameters, Boolean.valueOf(inExprOf_IdDecl_value));
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    inExprOf_IdDecl_visited.remove(_parameters);
    return inExprOf_IdDecl_value;
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set inExprOf_IdDecl_visited;
  protected java.util.Map inExprOf_IdDecl_values;
/**
 * @apilevel internal
 */
private void inExprOf_IdDecl_reset() {
  inExprOf_IdDecl_values = null;
  inExprOf_IdDecl_visited = null;
}  
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:38
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
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:46
   */
    if (isCircular()) {
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
      collection.add(error("symbol '" + getID() + "' is not declared"));
    if (isCircular())
      collection.add(error("the definition of symbol '" + getID() + "' is circular"));
  }

}
