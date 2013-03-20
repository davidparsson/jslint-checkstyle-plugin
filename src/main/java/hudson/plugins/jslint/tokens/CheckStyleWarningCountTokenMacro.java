package hudson.plugins.jslint.tokens;

import hudson.Extension;
import hudson.plugins.analysis.tokens.AbstractAnnotationsCountTokenMacro;
import hudson.plugins.jslint.CheckStyleMavenResultAction;
import hudson.plugins.jslint.CheckStyleResultAction;

/**
 * Provides a token that evaluates to the number of Checkstyle warnings.
 *
 * @author Ulli Hafner
 */
@Extension(optional = true)
public class CheckStyleWarningCountTokenMacro extends AbstractAnnotationsCountTokenMacro {
    /**
     * Creates a new instance of {@link CheckStyleWarningCountTokenMacro}.
     */
    @SuppressWarnings("unchecked")
    public CheckStyleWarningCountTokenMacro() {
        super("CHECKSTYLE_COUNT", CheckStyleResultAction.class, CheckStyleMavenResultAction.class);
    }
}

