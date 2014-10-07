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
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:10
 * @production FuncDecl : {@link Func} ::= <span class="component">{@link Type}</span> <span class="component">Name:{@link FuncIdDecl}</span> <span class="component">{@link Param}*</span> <span class="component">{@link Block}</span>;

 */
public class FuncDecl extends Func implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:28
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print("\nint " + getName().prettyString() + "("); 	// TODO: We only have one type
		for (int i = 0; i < getNumParam(); ++i) {
			out.print(getParamList().getChild(i).prettyString());		
			// When last element - append no comma
			if(i < getNumParam() - 1) {
				out.print(", ");
			}
		}
		out.print(")");
		getBlock().prettyPrint(out, ind);
		out.print("\n");
	}
  /**
   * @declaredat ASTNode:1
   */
  public FuncDecl() {
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
    children = new ASTNode[4];
    setChild(new List(), 2);
  }
  /**
   * @declaredat ASTNode:14
   */
  public FuncDecl(Type p0, FuncIdDecl p1, List<Param> p2, Block p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    localLookup_String_reset();
    localFunc_String_reset();
    lookup_String_reset();
    typeLookup_reset();
    argLookup_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:40
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public FuncDecl clone() throws CloneNotSupportedException {
    FuncDecl node = (FuncDecl) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:53
   */
  public FuncDecl copy() {
    try {
      FuncDecl node = (FuncDecl) clone();
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
   * @declaredat ASTNode:72
   */
  public FuncDecl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:81
   */
  public FuncDecl treeCopyNoTransform() {
    FuncDecl tree = (FuncDecl) copy();
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
   * @declaredat ASTNode:101
   */
  public FuncDecl treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:108
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
   * Replaces the Name child.
   * @param node The new node to replace the Name child.
   * @apilevel high-level
   */
  public void setName(FuncIdDecl node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Name child.
   * @return The current node used as the Name child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Name")
  public FuncIdDecl getName() {
    return (FuncIdDecl) getChild(1);
  }
  /**
   * Retrieves the Name child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Name child.
   * @apilevel low-level
   */
  public FuncIdDecl getNameNoTransform() {
    return (FuncIdDecl) getChildNoTransform(1);
  }
  /**
   * Replaces the Param list.
   * @param list The new list node to be used as the Param list.
   * @apilevel high-level
   */
  public void setParamList(List<Param> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Param list.
   * @return Number of children in the Param list.
   * @apilevel high-level
   */
  public int getNumParam() {
    return getParamList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Param list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Param list.
   * @apilevel low-level
   */
  public int getNumParamNoTransform() {
    return getParamListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Param list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Param list.
   * @apilevel high-level
   */
  public Param getParam(int i) {
    return (Param) getParamList().getChild(i);
  }
  /**
   * Check whether the Param list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParam() {
    return getParamList().getNumChild() != 0;
  }
  /**
   * Append an element to the Param list.
   * @param node The element to append to the Param list.
   * @apilevel high-level
   */
  public void addParam(Param node) {
    List<Param> list = (parent == null || state == null) ? getParamListNoTransform() : getParamList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addParamNoTransform(Param node) {
    List<Param> list = getParamListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Param list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParam(Param node, int i) {
    List<Param> list = getParamList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Param list.
   * @return The node representing the Param list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Param")
  public List<Param> getParamList() {
    List<Param> list = (List<Param>) getChild(2);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Param list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Param list.
   * @apilevel low-level
   */
  public List<Param> getParamListNoTransform() {
    return (List<Param>) getChildNoTransform(2);
  }
  /**
   * Retrieves the Param list.
   * @return The node representing the Param list.
   * @apilevel high-level
   */
  public List<Param> getParams() {
    return getParamList();
  }
  /**
   * Retrieves the Param list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Param list.
   * @apilevel low-level
   */
  public List<Param> getParamsNoTransform() {
    return getParamListNoTransform();
  }
  /**
   * Replaces the Block child.
   * @param node The new node to replace the Block child.
   * @apilevel high-level
   */
  public void setBlock(Block node) {
    setChild(node, 3);
  }
  /**
   * Retrieves the Block child.
   * @return The current node used as the Block child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Block")
  public Block getBlock() {
    return (Block) getChild(3);
  }
  /**
   * Retrieves the Block child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Block child.
   * @apilevel low-level
   */
  public Block getBlockNoTransform() {
    return (Block) getChildNoTransform(3);
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
  		for (Param par : getParams()) {
  			if (par.getIdDecl().getID().equals(name)) {
  				return par.getIdDecl();
  			}
  		}
  		return unknownDecl();
  	}
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
    FuncIdDecl localFunc_String_value = localFunc_compute(name);
    if (true) {
      localFunc_String_values.put(_parameters, localFunc_String_value);
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    localFunc_String_visited.remove(_parameters);
    return localFunc_String_value;
  }
  /**
   * @apilevel internal
   */
  private FuncIdDecl localFunc_compute(String name) {
  		FuncIdDecl decl = getName();
  		return !decl.isUnknown() ? decl : func(name);
  	}
  /**
   * FuncDecl : Func
   * Find function parameter declarations
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:82
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
   * @aspect TypeAnalysis
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:27
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
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:39
   */
  @ASTNodeAnnotation.Attribute
  public int argLookup() {
    if(argLookup_computed) {
      return argLookup_value;
    }
    if (argLookup_visited) {
      throw new RuntimeException("Circular definition of attr: argLookup in class: org.jastadd.ast.AST.InhDecl");
    }
    argLookup_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    argLookup_value = getParent().Define_int_argLookup(this, null);
    if (true) {
      argLookup_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    argLookup_visited = false;
    return argLookup_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean argLookup_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean argLookup_computed = false;
  /**
   * @apilevel internal
   */
  protected int argLookup_value;
/**
 * @apilevel internal
 */
private void argLookup_reset() {
  argLookup_computed = false;
  argLookup_visited = false;
}  
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:83
   * @apilevel internal
   */
  public IdDecl Define_IdDecl_lookup(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
{ 
		IdDecl decl = localLookup(name);
		return !decl.isUnknown() ? decl : lookup(name);
	}
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:31
   * @apilevel internal
   */
  public Type Define_Type_typeLookup(ASTNode caller, ASTNode child) {
    if (caller == getNameNoTransform()) {
      return !getType().isUnknownType() ? getType() : typeLookup();
    }
    else {
      return getParent().Define_Type_typeLookup(this, caller);
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:43
   * @apilevel internal
   */
  public int Define_int_argLookup(ASTNode caller, ASTNode child) {
    if (caller == getNameNoTransform()) {
      return getNumParam();
    }
    else {
      return getParent().Define_int_argLookup(this, caller);
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:47
   * @apilevel internal
   */
  public FuncDecl Define_FuncDecl_funcLookup(ASTNode caller, ASTNode child) {
    if (caller == getNameNoTransform()) {
      return this;
    }
    else {
      return getParent().Define_FuncDecl_funcLookup(this, caller);
    }
  }
}
