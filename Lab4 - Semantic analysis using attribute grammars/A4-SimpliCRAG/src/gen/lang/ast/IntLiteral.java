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
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:32
 * @production IntLiteral : {@link Literal} ::= <span class="component">&lt;NUMERAL:String&gt;</span>;

 */
public class IntLiteral extends Literal implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:164
   */
  public String prettyString() {
		return getNUMERAL();
	}
  /**
   * @declaredat ASTNode:1
   */
  public IntLiteral() {
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
  public IntLiteral(String p0) {
    setNUMERAL(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public IntLiteral(beaver.Symbol p0) {
    setNUMERAL(p0);
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
    isVariable_reset();
    type_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:35
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:41
   */
  public IntLiteral clone() throws CloneNotSupportedException {
    IntLiteral node = (IntLiteral) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:48
   */
  public IntLiteral copy() {
    try {
      IntLiteral node = (IntLiteral) clone();
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
   * @declaredat ASTNode:67
   */
  public IntLiteral fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public IntLiteral treeCopyNoTransform() {
    IntLiteral tree = (IntLiteral) copy();
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
   * @declaredat ASTNode:96
   */
  public IntLiteral treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:103
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node)  && (tokenString_NUMERAL == ((IntLiteral)node).tokenString_NUMERAL);    
  }
  /**
   * Replaces the lexeme NUMERAL.
   * @param value The new value for the lexeme NUMERAL.
   * @apilevel high-level
   */
  public void setNUMERAL(String value) {
    tokenString_NUMERAL = value;
  }
  /**
   * @apilevel internal
   */
  protected String tokenString_NUMERAL;
  /**
   */
  public int NUMERALstart;
  /**
   */
  public int NUMERALend;
  /**
   * JastAdd-internal setter for lexeme NUMERAL using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme NUMERAL
   * @apilevel internal
   */
  public void setNUMERAL(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setNUMERAL is only valid for String lexemes");
    tokenString_NUMERAL = (String)symbol.value;
    NUMERALstart = symbol.getStart();
    NUMERALend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme NUMERAL.
   * @return The value for the lexeme NUMERAL.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="NUMERAL")
  public String getNUMERAL() {
    return tokenString_NUMERAL != null ? tokenString_NUMERAL : "";
  }
  /**
   * @apilevel internal
   */
  protected boolean isVariable_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean isVariable_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isVariable_value;
/**
 * @apilevel internal
 */
private void isVariable_reset() {
  isVariable_computed = false;
  isVariable_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public boolean isVariable() {
    if(isVariable_computed) {
      return isVariable_value;
    }
    if (isVariable_visited) {
      throw new RuntimeException("Circular definition of attr: isVariable in class: org.jastadd.ast.AST.SynDecl");
    }
    isVariable_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    isVariable_value = false;
    if (true) {
      isVariable_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    isVariable_visited = false;
    return isVariable_value;
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
    type_value = new IntType();
    if (true) {
      type_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    type_visited = false;
    return type_value;
  }
}
