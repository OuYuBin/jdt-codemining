package org.eclipse.jdt.internal.ui.preferences;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.preference.IPreferenceStore;

public class MyPreferenceConstants {

	/**
	 * A named preference that stores the value for "Show references" codemining.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_REFERENCES = "java.codemining.references"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show references" only if there
	 * is at least one reference.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_REFERENCES_AT_LEAST_ONE = "java.codemining.references.atLeastOne"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show implementations"
	 * codemining.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_IMPLEMENTATIONS = "java.codemining.implementations"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show implementations" only if
	 * there is at least one implementation.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_IMPLEMENTATIONS_AT_LEAST_ONE = "java.codemining.implementations.atLeastOne"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show method parameter names"
	 * codemining.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_METHOD_PARAMETER_NAMES = "java.codemining.methodParameter.names"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show method parameter types".
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_METHOD_PARAMETER_TYPES = "java.codemining.methodParameter.types"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show end statement".
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_END_STATEMENT = "java.codemining.endStatement"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show JUnit status".
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_JUNIT_STATUS = "java.codemining.junit.status"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show JUnit run".
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_JUNIT_RUN = "java.codemining.junit.run"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show JUnit debug".
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_JUNIT_DEBUG = "java.codemining.junit.debug"; //$NON-NLS-1$

	/**
	 * A named preference that stores the value for "Show variable values inline
	 * while debugging".
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.14
	 */
	public static final String EDITOR_JAVA_CODEMINING_SHOW_VARIABLE_VALUE_WHILE_DEBUGGING = "java.codemining.debug.variable"; //$NON-NLS-1$

	/**
	 * Initializes the given preference store with the default values.
	 *
	 * @param store the preference store to be initialized
	 *
	 */
	public static void initializeDefaultValues(IPreferenceStore store) {
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_REFERENCES, JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_REFERENCES_AT_LEAST_ONE, JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_IMPLEMENTATIONS, JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_IMPLEMENTATIONS_AT_LEAST_ONE,
				JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_METHOD_PARAMETER_NAMES, JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_METHOD_PARAMETER_TYPES, JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_END_STATEMENT, JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_JUNIT_STATUS, JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_JUNIT_RUN, JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_JUNIT_DEBUG, JavaCore.DISABLED);
		store.setDefault(MyPreferenceConstants.EDITOR_JAVA_CODEMINING_SHOW_VARIABLE_VALUE_WHILE_DEBUGGING,
				JavaCore.DISABLED);
	}
}
