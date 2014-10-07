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
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:51
 * @production IdDecl : {@link ASTNode} ::= <span class="component">&lt;ID:String&gt;</span>;

 */
public class IdDecl extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:156
   */
  public String prettyString() {
		return getID();
	}
  /**
   * @declaredat ASTNode:1
   */
  public IdDecl() {
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
  public IdDecl(String p0) {
    setID(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public IdDecl(beaver.Symbol p0) {
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
    isMultiplyDeclared_reset();
    type_reset();
    isUnknown_reset();
    lookup_String_reset();
    typeLookup_reset();
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
  public IdDecl clone() throws CloneNotSupportedException {
    IdDecl node = (IdDecl) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:51
   */
  public IdDecl copy() {
    try {
      IdDecl node = (IdDecl) clone();
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
  public IdDecl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public IdDecl treeCopyNoTransform() {
    IdDecl tree = (IdDecl) copy();
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
  public IdDecl treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:106
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node)  && (tokenString_ID == ((IdDecl)node).tokenString_ID);    
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
  protected boolean isMultiplyDeclared_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean isMultiplyDeclared_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isMultiplyDeclared_value;
/**
 * @apilevel internal
 */
private void isMultiplyDeclared_reset() {
  isMultiplyDeclared_computed = false;
  isMultiplyDeclared_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public boolean isMultiplyDeclared() {
    if(isMultiplyDeclared_computed) {
      return isMultiplyDeclared_value;
    }
    if (isMultiplyDeclared_visited) {
      throw new RuntimeException("Circular definition of attr: isMultiplyDeclared in class: org.jastadd.ast.AST.SynDecl");
    }
    isMultiplyDeclared_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    isMultiplyDeclared_value = lookup(getID()) != this;
    if (true) {
      isMultiplyDeclared_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    isMultiplyDeclared_visited = false;
    return isMultiplyDeclared_value;
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
    type_value = typeLookup();
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
  protected boolean isUnknown_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean isUnknown_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isUnknown_value;
/**
 * @apilevel internal
 */
private void isUnknown_reset() {
  isUnknown_computed = false;
  isUnknown_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public boolean isUnknown() {
    if(isUnknown_computed) {
      return isUnknown_value;
    }
    if (isUnknown_visited) {
      throw new RuntimeException("Circular definition of attr: isUnknown in class: org.jastadd.ast.AST.SynDecl");
    }
    isUnknown_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    isUnknown_value = false;
    if (true) {
      isUnknown_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    isUnknown_visited = false;
    return isUnknown_value;
  }
  /**
   * IdDecl: Start isMultiplyDeclared lookup-pattern
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:19
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
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:34
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
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:42
   */
    if (isMultiplyDeclared()) {
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
    if (isMultiplyDeclared())
      collection.add(error("symbol '" + getID() + "' is already declared!"));
  }

}
