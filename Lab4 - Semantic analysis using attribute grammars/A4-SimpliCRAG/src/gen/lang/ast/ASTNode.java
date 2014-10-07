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
 * @production ASTNode;

 */
public class ASTNode<T extends ASTNode> extends beaver.Symbol  implements Cloneable, Iterable<T> {
  /**
   * @aspect DumpTree
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/DumpTree.jrag:6
   */
  private String DUMP_TREE_INDENT = "  ";
  /**
   * @aspect DumpTree
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/DumpTree.jrag:8
   */
  public String dumpTree() {
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		dumpTree(new PrintStream(bytes));
		return bytes.toString();
	}
  /**
   * @aspect DumpTree
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/DumpTree.jrag:14
   */
  public void dumpTree(PrintStream out) {
		dumpTree(out, 0);
		out.flush();
	}
  /**
   * @aspect DumpTree
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/DumpTree.jrag:19
   */
  public void dumpTree(PrintStream out, int indent) {
		for (int i = 0; i < indent; i++) {
			out.print(DUMP_TREE_INDENT);
		}
		out.println(getClass().getSimpleName());
		for (ASTNode child: this) {
			child.dumpTree(out, indent+1);
		}
	}
  /**
   * @aspect Errors
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:22
   */
  protected ErrorMessage error(String message) {
		return new ErrorMessage(message, getLine(getStart()));
	}
  /**
   * @param err where to write error messages
   * @param symbols symbol table
   * @aspect MaximumStatementNesting
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/MaximumStatementNesting.jrag:42
   */
  public void checkMSN(PrintStream out, NestingTable scopes, int depth) {
		for (int i = 0; i < getNumChild(); ++i) {
			getChild(i).checkMSN(out, scopes, depth);
		}
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:16
   */
  public void prettyPrint(PrintStream out, String ind) {
		for (int i = 0; i < getNumChild(); ++i) {
			getChild(i).prettyPrint(out, ind);
		}
	}
  /**
   * @declaredat ASTNode:1
   */
  public ASTNode() {
    super();
    init$Children();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:11
   */
  public void init$Children() {
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:16
   */
  private int childIndex;
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  public int getIndexOfChild(ASTNode node) {
    if (node == null) {
      return -1;
    }
    if (node.childIndex < numChildren && node == children[node.childIndex]) {
      return node.childIndex;
    }
    for(int i = 0; children != null && i < children.length; i++) {
      if(children[i] == node) {
        node.childIndex = i;
        return i;
      }
    }
    return -1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:40
   */
  public static final boolean generatedWithCacheCycle = true;
  /**
   * @apilevel internal
   * @declaredat ASTNode:44
   */
  public static final boolean generatedWithComponentCheck = false;
  /**
   * Parent pointer
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  protected ASTNode parent;
  /**
   * Child array
   * @apilevel low-level
   * @declaredat ASTNode:56
   */
  protected ASTNode[] children;
  /**
   * @apilevel internal
   * @declaredat ASTNode:62
   */
  protected static ASTNode$State state = new ASTNode$State();
  /**
   * @apilevel internal
   * @declaredat ASTNode:67
   */
  public final ASTNode$State state() {
    return state;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public T getChild(int i) {

    // No rewrites
    ASTNode child = getChildNoTransform(i);
    return (T) child;

  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:85
   */
  public void addChild(T node) {
    setChild(node, getNumChildNoTransform());
  }
  /**
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @apilevel low-level
   * @declaredat ASTNode:92
   */
  public final T getChildNoTransform(int i) {
    if (children == null) {
      return null;
    }
    T child = (T)children[i];
    return child;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:102
   */
  protected int numChildren;
  /**
   * @apilevel low-level
   * @declaredat ASTNode:107
   */
  protected int numChildren() {
    return numChildren;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:114
   */
  public int getNumChild() {
    return numChildren();
  }
  /**
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @apilevel low-level
   * @declaredat ASTNode:122
   */
  public final int getNumChildNoTransform() {
    return numChildren();
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:128
   */
  public void setChild(ASTNode node, int i) {
    if(children == null) {
      children = new ASTNode[(i+1>4 || !(this instanceof List))?i+1:4];
    } else if (i >= children.length) {
      ASTNode c[] = new ASTNode[i << 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = node;
    if(i >= numChildren) {
      numChildren = i+1;
    }
    if(node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:148
   */
  public void insertChild(ASTNode node, int i) {
    if(children == null) {
      children = new ASTNode[(i+1>4 || !(this instanceof List))?i+1:4];
      children[i] = node;
    } else {
      ASTNode c[] = new ASTNode[children.length + 1];
      System.arraycopy(children, 0, c, 0, i);
      c[i] = node;
      if(i < children.length) {
        System.arraycopy(children, i, c, i+1, children.length-i);
        for(int j = i+1; j < c.length; ++j) {
          if(c[j] != null) {
            c[j].childIndex = j;
          }
        }
      }
      children = c;
    }
    numChildren++;
    if(node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:175
   */
  public void removeChild(int i) {
    if(children != null) {
      ASTNode child = (ASTNode) children[i];
      if(child != null) {
        child.parent = null;
        child.childIndex = -1;
      }
      // Adding a check of this instance to make sure its a List, a move of children doesn't make
      // any sense for a node unless its a list. Also, there is a problem if a child of a non-List node is removed
      // and siblings are moved one step to the right, with null at the end.
      if (this instanceof List || this instanceof Opt) {
        System.arraycopy(children, i+1, children, i, children.length-i-1);
        children[children.length-1] = null;
        numChildren--;
        // fix child indices
        for(int j = i; j < numChildren; ++j) {
          if(children[j] != null) {
            child = (ASTNode) children[j];
            child.childIndex = j;
          }
        }
      } else {
        children[i] = null;
      }
    }
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:204
   */
  public ASTNode getParent() {
    ;
    return (ASTNode) parent;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:211
   */
  public void setParent(ASTNode node) {
    parent = node;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:261
   */
  public java.util.Iterator<T> iterator() {
    return new java.util.Iterator<T>() {
      private int counter = 0;
      public boolean hasNext() {
        return counter < getNumChild();
      }
      public T next() {
        if(hasNext())
          return (T)getChild(counter++);
        else
          return null;
      }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:281
   */
  public void flushTreeCache() {
    flushCache();
    if (children == null) {
      return;
    }
    for (int i = 0; i < children.length; i++) {
      if (children[i] != null) {
        ((ASTNode)children[i]).flushTreeCache();
      }
    }
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:295
   */
  public void flushCache() {
    flushAttrAndCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:301
   */
  public void flushAttrAndCollectionCache() {
    flushAttrCache();
    flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:308
   */
  public void flushAttrCache() {
    program_reset();
    unknownDecl_reset();
    unknownFunc_reset();
    unknownType_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:317
   */
  public void flushCollectionCache() {
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:322
   */
  public ASTNode<T> clone() throws CloneNotSupportedException {
    ASTNode node = (ASTNode) super.clone();
    node.flushAttrAndCollectionCache();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:330
   */
  public ASTNode<T> copy() {
    try {
      ASTNode node = (ASTNode) clone();
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
   * @declaredat ASTNode:349
   */
  public ASTNode<T> fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:358
   */
  public ASTNode<T> treeCopyNoTransform() {
    ASTNode tree = (ASTNode) copy();
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
   * @declaredat ASTNode:378
   */
  public ASTNode<T> treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * Performs a full traversal of the tree using getChild to trigger rewrites
   * @apilevel low-level
   * @declaredat ASTNode:386
   */
  public void doFullTraversal() {
    for (int i = 0; i < getNumChild(); i++) {
      getChild(i).doFullTraversal();
    }
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:394
   */
  protected boolean is$Equal(ASTNode n1, ASTNode n2) {
    if (n1 == null && n2 == null) return true;
    if (n1 == null || n2 == null) return false;
    return n1.is$Equal(n2);
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:402
   */
  protected boolean is$Equal(ASTNode node) {
    if (getClass() != node.getClass()) {
      return false;
    }
    if (numChildren != node.numChildren) {
      return false;
    }
    for (int i = 0; i < numChildren; i++) {
      if (children[i] == null && node.children[i] != null) {
        return false;
      }
      if (!((ASTNode)children[i]).is$Equal(((ASTNode)node.children[i]))) {
        return false;
      }
    }
    return true;
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:28
   */
    protected void collect_contributors_Program_errors() {
    for(int i = 0; i < getNumChild(); i++) {
      getChild(i).collect_contributors_Program_errors();
    }
  }
  protected void contributeTo_Program_Program_errors(Set<ErrorMessage> collection) {
  }

  /**
   * @attribute inh
   * @aspect Errors
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:30
   */
  @ASTNodeAnnotation.Attribute
  public Program program() {
    if(program_computed) {
      return program_value;
    }
    if (program_visited) {
      throw new RuntimeException("Circular definition of attr: program in class: org.jastadd.ast.AST.InhDecl");
    }
    program_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    program_value = getParent().Define_Program_program(this, null);
    if (true) {
      program_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    program_visited = false;
    return program_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean program_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean program_computed = false;
  /**
   * @apilevel internal
   */
  protected Program program_value;
/**
 * @apilevel internal
 */
private void program_reset() {
  program_computed = false;
  program_value = null;
  program_visited = false;
}  
  /**
   * @attribute inh
   * @aspect UnknownDecl
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/UnknownDecl.jrag:4
   */
  @ASTNodeAnnotation.Attribute
  public UnknownDecl unknownDecl() {
    if(unknownDecl_computed) {
      return unknownDecl_value;
    }
    if (unknownDecl_visited) {
      throw new RuntimeException("Circular definition of attr: unknownDecl in class: org.jastadd.ast.AST.InhDecl");
    }
    unknownDecl_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    unknownDecl_value = getParent().Define_UnknownDecl_unknownDecl(this, null);
    if (true) {
      unknownDecl_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    unknownDecl_visited = false;
    return unknownDecl_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean unknownDecl_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean unknownDecl_computed = false;
  /**
   * @apilevel internal
   */
  protected UnknownDecl unknownDecl_value;
/**
 * @apilevel internal
 */
private void unknownDecl_reset() {
  unknownDecl_computed = false;
  unknownDecl_value = null;
  unknownDecl_visited = false;
}  
  /**
   * @attribute inh
   * @aspect UnknownFunc
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/UnknownFunc.jrag:4
   */
  @ASTNodeAnnotation.Attribute
  public UnknownFunc unknownFunc() {
    if(unknownFunc_computed) {
      return unknownFunc_value;
    }
    if (unknownFunc_visited) {
      throw new RuntimeException("Circular definition of attr: unknownFunc in class: org.jastadd.ast.AST.InhDecl");
    }
    unknownFunc_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    unknownFunc_value = getParent().Define_UnknownFunc_unknownFunc(this, null);
    if (true) {
      unknownFunc_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    unknownFunc_visited = false;
    return unknownFunc_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean unknownFunc_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean unknownFunc_computed = false;
  /**
   * @apilevel internal
   */
  protected UnknownFunc unknownFunc_value;
/**
 * @apilevel internal
 */
private void unknownFunc_reset() {
  unknownFunc_computed = false;
  unknownFunc_value = null;
  unknownFunc_visited = false;
}  
  /**
   * @attribute inh
   * @aspect UnknownType
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/UnknownType.jrag:4
   */
  @ASTNodeAnnotation.Attribute
  public UnknownType unknownType() {
    if(unknownType_computed) {
      return unknownType_value;
    }
    if (unknownType_visited) {
      throw new RuntimeException("Circular definition of attr: unknownType in class: org.jastadd.ast.AST.InhDecl");
    }
    unknownType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    unknownType_value = getParent().Define_UnknownType_unknownType(this, null);
    if (true) {
      unknownType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    unknownType_visited = false;
    return unknownType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean unknownType_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean unknownType_computed = false;
  /**
   * @apilevel internal
   */
  protected UnknownType unknownType_value;
/**
 * @apilevel internal
 */
private void unknownType_reset() {
  unknownType_computed = false;
  unknownType_value = null;
  unknownType_visited = false;
}  
  /**
   * @apilevel internal
   */
  public Program Define_Program_program(ASTNode caller, ASTNode child) {
    return getParent().Define_Program_program(this, caller);
  }
  /**
   * @apilevel internal
   */
  public IdDecl Define_IdDecl_lookup(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_IdDecl_lookup(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public FuncIdDecl Define_FuncIdDecl_func(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_FuncIdDecl_func(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_inExprOf(ASTNode caller, ASTNode child, IdDecl decl) {
    return getParent().Define_boolean_inExprOf(this, caller, decl);
  }
  /**
   * @apilevel internal
   */
  public Type Define_Type_typeLookup(ASTNode caller, ASTNode child) {
    return getParent().Define_Type_typeLookup(this, caller);
  }
  /**
   * @apilevel internal
   */
  public int Define_int_argLookup(ASTNode caller, ASTNode child) {
    return getParent().Define_int_argLookup(this, caller);
  }
  /**
   * @apilevel internal
   */
  public UnknownDecl Define_UnknownDecl_unknownDecl(ASTNode caller, ASTNode child) {
    return getParent().Define_UnknownDecl_unknownDecl(this, caller);
  }
  /**
   * @apilevel internal
   */
  public UnknownFunc Define_UnknownFunc_unknownFunc(ASTNode caller, ASTNode child) {
    return getParent().Define_UnknownFunc_unknownFunc(this, caller);
  }
  /**
   * @apilevel internal
   */
  public UnknownType Define_UnknownType_unknownType(ASTNode caller, ASTNode child) {
    return getParent().Define_UnknownType_unknownType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public FuncDecl Define_FuncDecl_funcLookup(ASTNode caller, ASTNode child) {
    return getParent().Define_FuncDecl_funcLookup(this, caller);
  }
}
