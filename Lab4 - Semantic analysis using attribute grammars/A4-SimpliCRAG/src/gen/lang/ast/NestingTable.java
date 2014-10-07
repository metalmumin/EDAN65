package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
/**
 * @ast class
 * @aspect MaximumStatementNesting
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/MaximumStatementNesting.jrag:6
 */
public class NestingTable extends java.lang.Object {

		private Set<Integer> scopes;


		
		public NestingTable() {
			scopes = new HashSet<Integer>();
		}



		/**
		 * Attempt to add a new scope depth to the nesting table.
		 * @return true if name was not already declared
		 */
		public boolean add(Integer depth) {
			return scopes.add(depth);
			
		}



		public String print() {
			return scopes.toString();
		}


}
