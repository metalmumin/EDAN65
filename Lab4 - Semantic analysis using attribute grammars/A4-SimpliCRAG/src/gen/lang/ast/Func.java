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
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:3
 * @production Func : {@link ASTNode};

 */
public abstract class Func extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Func() {
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
   * @apilevel low-level
   * @declaredat ASTNode:15
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:21
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    localFunc_String_reset();
    func_String_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:29
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:35
   */
  public Func clone() throws CloneNotSupportedException {
    Func node = (Func) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:46
   */
  public abstract Func fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:53
   */
  public abstract Func treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:61
   */
  public abstract Func treeCopy();
  /**
   * @apilevel internal
   */
  protected java.util.Set localFunc_String_visited;
  protected java.util.Map localFunc_String_values;
/**
 * @apilevel internal
 */
private void localFunc_String_reset() {
  localFunc_String_values = null;
  localFunc_String_visited = null;
}  
  @ASTNodeAnnotation.Attribute
  public FuncIdDecl localFunc(String name) {
    Object _parameters = name;
    if (localFunc_String_visited == null) localFunc_String_visited = new java.util.HashSet(4);
    if (localFunc_String_values == null) localFunc_String_values = new java.util.HashMap(4);
    if(localFunc_String_values.containsKey(_parameters)) {
      return (FuncIdDecl)localFunc_String_values.get(_parameters);
    }
    if (localFunc_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: localFunc in class: org.jastadd.ast.AST.SynDecl");
    }
    localFunc_String_visited.add(_parameters);
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    FuncIdDecl localFunc_String_value = unknownFunc();
    if (true) {
      localFunc_String_values.put(_parameters, localFunc_String_value);
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    localFunc_String_visited.remove(_parameters);
    return localFunc_String_value;
  }
  /**
   * abstract Func
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:115
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
}
