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
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:1
 * @production Program : {@link ASTNode} ::= <span class="component">{@link Func}*</span>;

 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @param err where to write error messages
   * @aspect MaximumStatementNesting
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/MaximumStatementNesting.jrag:30
   */
  public void checkMSN(PrintStream out) {
		NestingTable scopes = new NestingTable();
		int depth = 0;
		checkMSN(out, scopes, depth);
		
		out.println(scopes.print());
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:5
   */
  public void prettyPrint(PrintStream out) {
		out.print ("");
		String ind = "";
		
		if(hasFunc()) {
			for(int i = 0; i < getNumFunc(); ++i) {
				getFunc(i).prettyPrint(out,ind);
			}
		}
	}
  /**
   * @declaredat ASTNode:1
   */
  public Program() {
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
  public Program(List<Func> p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    localFunc_String_int_reset();
    predefinedFunctions_reset();
    unknownDecl_reset();
    unknownFunc_reset();
    unknownType_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    Program_errors_visited = false;
    Program_errors_computed = false;
    Program_errors_value = null;
        Program_errors_contributors = null;
        collect_contributors_Program_errors = false;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:48
   */
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:55
   */
  public Program copy() {
    try {
      Program node = (Program) clone();
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
   * @declaredat ASTNode:74
   */
  public Program fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:83
   */
  public Program treeCopyNoTransform() {
    Program tree = (Program) copy();
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
   * @declaredat ASTNode:103
   */
  public Program treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:110
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) ;    
  }
  /**
   * Replaces the Func list.
   * @param list The new list node to be used as the Func list.
   * @apilevel high-level
   */
  public void setFuncList(List<Func> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Func list.
   * @return Number of children in the Func list.
   * @apilevel high-level
   */
  public int getNumFunc() {
    return getFuncList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Func list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Func list.
   * @apilevel low-level
   */
  public int getNumFuncNoTransform() {
    return getFuncListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Func list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Func list.
   * @apilevel high-level
   */
  public Func getFunc(int i) {
    return (Func) getFuncList().getChild(i);
  }
  /**
   * Check whether the Func list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasFunc() {
    return getFuncList().getNumChild() != 0;
  }
  /**
   * Append an element to the Func list.
   * @param node The element to append to the Func list.
   * @apilevel high-level
   */
  public void addFunc(Func node) {
    List<Func> list = (parent == null || state == null) ? getFuncListNoTransform() : getFuncList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addFuncNoTransform(Func node) {
    List<Func> list = getFuncListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Func list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setFunc(Func node, int i) {
    List<Func> list = getFuncList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Func list.
   * @return The node representing the Func list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Func")
  public List<Func> getFuncList() {
    List<Func> list = (List<Func>) getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Func list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Func list.
   * @apilevel low-level
   */
  public List<Func> getFuncListNoTransform() {
    return (List<Func>) getChildNoTransform(0);
  }
  /**
   * Retrieves the Func list.
   * @return The node representing the Func list.
   * @apilevel high-level
   */
  public List<Func> getFuncs() {
    return getFuncList();
  }
  /**
   * Retrieves the Func list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Func list.
   * @apilevel low-level
   */
  public List<Func> getFuncsNoTransform() {
    return getFuncListNoTransform();
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:28
   */
    private boolean collect_contributors_Program_errors = false;
  protected void collect_contributors_Program_errors() {
    if(collect_contributors_Program_errors) return;
    super.collect_contributors_Program_errors();
    collect_contributors_Program_errors = true;
  }

  /**
   * @apilevel internal
   */
  protected java.util.Set localFunc_String_int_visited;
  protected java.util.Map localFunc_String_int_values;
/**
 * @apilevel internal
 */
private void localFunc_String_int_reset() {
  localFunc_String_int_values = null;
  localFunc_String_int_visited = null;
}  
  @ASTNodeAnnotation.Attribute
  public FuncIdDecl localFunc(String name, int until) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(name);
    _parameters.add(Integer.valueOf(until));
    if (localFunc_String_int_visited == null) localFunc_String_int_visited = new java.util.HashSet(4);
    if (localFunc_String_int_values == null) localFunc_String_int_values = new java.util.HashMap(4);
    if(localFunc_String_int_values.containsKey(_parameters)) {
      return (FuncIdDecl)localFunc_String_int_values.get(_parameters);
    }
    if (localFunc_String_int_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: localFunc in class: org.jastadd.ast.AST.SynDecl");
    }
    localFunc_String_int_visited.add(_parameters);
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    FuncIdDecl localFunc_String_int_value = localFunc_compute(name, until);
    if (true) {
      localFunc_String_int_values.put(_parameters, localFunc_String_int_value);
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    localFunc_String_int_visited.remove(_parameters);
    return localFunc_String_int_value;
  }
  /**
   * @apilevel internal
   */
  private FuncIdDecl localFunc_compute(String name, int until) {
  		for (int i = 0; i <= until; i++) {
  			FuncIdDecl decl = getFunc(i).localFunc(name);
  			if (decl.getID().equals(name)) {
  				return decl;
  			}
  		}
  		return unknownFunc();
  	}
  /**
   * @apilevel internal
   */
  protected boolean predefinedFunctions_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean predefinedFunctions_computed = false;
  /**
   * @apilevel internal
   */
  protected List<FuncDecl> predefinedFunctions_value;
/**
 * @apilevel internal
 */
private void predefinedFunctions_reset() {
  predefinedFunctions_computed = false;
  predefinedFunctions_value = null;
  predefinedFunctions_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public List<FuncDecl> predefinedFunctions() {
    if(predefinedFunctions_computed) {
      return predefinedFunctions_value;
    }
    if (predefinedFunctions_visited) {
      throw new RuntimeException("Circular definition of attr: predefinedFunctions in class: org.jastadd.ast.AST.SynDecl");
    }
    predefinedFunctions_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    predefinedFunctions_value = predefinedFunctions_compute();
    predefinedFunctions_value.setParent(this);
    if (true) {
      predefinedFunctions_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    predefinedFunctions_visited = false;
    return predefinedFunctions_value;
  }
  /**
   * @apilevel internal
   */
  private List<FuncDecl> predefinedFunctions_compute() {
  		List<FuncDecl> list = new List<FuncDecl>();
  		
  		// read node
  		FuncDecl read = new FuncDecl();
  		read.setType(new IntType());
  		read.setName(new FuncIdDecl(new String("read")));
  		read.setBlock(new Block());
  		list.add(read);
  		
  		// print node
  		FuncDecl print = new FuncDecl();
  		print.setType(unknownType());
  		print.setName(new FuncIdDecl(new String("print")));
  		print.addParam(new Param(new IntType(), new IdDecl("out")));
  		print.setBlock(new Block());
  		return list;
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
  @ASTNodeAnnotation.Attribute
  public UnknownDecl unknownDecl() {
    if(unknownDecl_computed) {
      return unknownDecl_value;
    }
    if (unknownDecl_visited) {
      throw new RuntimeException("Circular definition of attr: unknownDecl in class: org.jastadd.ast.AST.SynDecl");
    }
    unknownDecl_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    unknownDecl_value = new UnknownDecl("<unknown>");
    unknownDecl_value.setParent(this);
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
  @ASTNodeAnnotation.Attribute
  public UnknownFunc unknownFunc() {
    if(unknownFunc_computed) {
      return unknownFunc_value;
    }
    if (unknownFunc_visited) {
      throw new RuntimeException("Circular definition of attr: unknownFunc in class: org.jastadd.ast.AST.SynDecl");
    }
    unknownFunc_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    unknownFunc_value = new UnknownFunc("<unknownFunc>");
    unknownFunc_value.setParent(this);
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
  @ASTNodeAnnotation.Attribute
  public UnknownType unknownType() {
    if(unknownType_computed) {
      return unknownType_value;
    }
    if (unknownType_visited) {
      throw new RuntimeException("Circular definition of attr: unknownType in class: org.jastadd.ast.AST.SynDecl");
    }
    unknownType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    unknownType_value = new UnknownType("<unknownType>");
    unknownType_value.setParent(this);
    if (true) {
      unknownType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    unknownType_visited = false;
    return unknownType_value;
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:31
   * @apilevel internal
   */
  public Program Define_Program_program(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return this;
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:8
   * @apilevel internal
   */
  public IdDecl Define_IdDecl_lookup(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownDecl();
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:129
   * @apilevel internal
   */
  public FuncIdDecl Define_FuncIdDecl_func(ASTNode caller, ASTNode child, String name) {
    if (caller == getFuncListNoTransform()) {
      int index = caller.getIndexOfChild(child);
      {
		FuncIdDecl decl = localFunc(name, index);
		return !decl.isUnknown() ? decl : unknownFunc();
	}
    }
    else {
      return getParent().Define_FuncIdDecl_func(this, caller, name);
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/NameAnalysis.jrag:151
   * @apilevel internal
   */
  public boolean Define_boolean_inExprOf(ASTNode caller, ASTNode child, IdDecl decl) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:6
   * @apilevel internal
   */
  public Type Define_Type_typeLookup(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownType();
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/TypeAnalysis.jrag:7
   * @apilevel internal
   */
  public int Define_int_argLookup(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return 0;
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/UnknownDecl.jrag:5
   * @apilevel internal
   */
  public UnknownDecl Define_UnknownDecl_unknownDecl(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownDecl();
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/UnknownFunc.jrag:5
   * @apilevel internal
   */
  public UnknownFunc Define_UnknownFunc_unknownFunc(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownFunc();
    }
  }
  /**
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/UnknownType.jrag:5
   * @apilevel internal
   */
  public UnknownType Define_UnknownType_unknownType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownType();
    }
  }
  /**
   * @attribute coll
   * @aspect Errors
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:28
   */
  @ASTNodeAnnotation.Attribute
  public Set<ErrorMessage> errors() {
    if(Program_errors_computed) {
      return Program_errors_value;
    }
    if (Program_errors_visited) {
      throw new RuntimeException("Circular definition of attr: errors in class: org.jastadd.ast.AST.CollDecl");
    }
    Program_errors_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    Program_errors_value = errors_compute();
    if (true) {
      Program_errors_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    Program_errors_visited = false;
    return Program_errors_value;
  }
  java.util.Collection Program_errors_contributors;

  /**
   * @apilevel internal
   * @return the contributor set for errors
   */
  public java.util.Collection Program_errors_contributors() {
    if(Program_errors_contributors == null)
      Program_errors_contributors  = new java.util.LinkedList();
    return Program_errors_contributors;
  }

  /**
   * @apilevel internal
   */
  private Set<ErrorMessage> errors_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program)) {
      node = node.getParent();
    }
    Program root = (Program) node;
    root.collect_contributors_Program_errors();
    Program_errors_value = new TreeSet<ErrorMessage>();
    if(Program_errors_contributors != null)
    for (java.util.Iterator iter = Program_errors_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode) iter.next();
      contributor.contributeTo_Program_Program_errors(Program_errors_value);
    }
    // TODO: disabled temporarily since collections may not be cached
    //Program_errors_contributors = null;
    return Program_errors_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean Program_errors_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean Program_errors_computed = false;
  /**
   * @apilevel internal
   */
  protected Set<ErrorMessage> Program_errors_value;
/**
 * @apilevel internal
 */
private void Program_errors_reset() {
  Program_errors_computed = false;
  Program_errors_value = null;
  Program_errors_visited = false;
}  
}
