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
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:7
 * @production BoolType : {@link Type} ::= <span class="component">&lt;BOOL:String&gt;</span>;

 */
public class BoolType extends Type implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:102
   */
  public String getType() {
		return ("bool ");
	}
  /**
   * @declaredat ASTNode:1
   */
  public BoolType() {
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
  public BoolType(String p0) {
    setBOOL(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public BoolType(beaver.Symbol p0) {
    setBOOL(p0);
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
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:39
   */
  public BoolType clone() throws CloneNotSupportedException {
    BoolType node = (BoolType) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public BoolType copy() {
    try {
      BoolType node = (BoolType) clone();
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
   * @declaredat ASTNode:65
   */
  public BoolType fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public BoolType treeCopyNoTransform() {
    BoolType tree = (BoolType) copy();
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
   * @declaredat ASTNode:94
   */
  public BoolType treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:101
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node)  && (tokenString_BOOL == ((BoolType)node).tokenString_BOOL);    
  }
  /**
   * Replaces the lexeme BOOL.
   * @param value The new value for the lexeme BOOL.
   * @apilevel high-level
   */
  public void setBOOL(String value) {
    tokenString_BOOL = value;
  }
  /**
   * @apilevel internal
   */
  protected String tokenString_BOOL;
  /**
   */
  public int BOOLstart;
  /**
   */
  public int BOOLend;
  /**
   * JastAdd-internal setter for lexeme BOOL using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme BOOL
   * @apilevel internal
   */
  public void setBOOL(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setBOOL is only valid for String lexemes");
    tokenString_BOOL = (String)symbol.value;
    BOOLstart = symbol.getStart();
    BOOLend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme BOOL.
   * @return The value for the lexeme BOOL.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="BOOL")
  public String getBOOL() {
    return tokenString_BOOL != null ? tokenString_BOOL : "";
  }
}
