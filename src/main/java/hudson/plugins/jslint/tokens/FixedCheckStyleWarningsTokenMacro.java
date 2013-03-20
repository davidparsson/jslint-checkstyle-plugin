package hudson.plugins.jslint.tokens;

import hudson.Extension;
import hudson.plugins.analysis.tokens.AbstractFixedAnnotationsTokenMacro;
import hudson.plugins.jslint.CheckStyleMavenResultAction;
import hudson.plugins.jslint.CheckStyleResultAction;

/**
 * Provides a token that evaluates to the number of fixed Checkstyle warnings.
 *
 * @author Ulli Hafner
 */
@Extension(optional = true)
public class FixedCheckStyleWarningsTokenMacro extends AbstractFixedAnnotationsTokenMacro {
    /**
     * Creates a new instance of {@link FixedCheckStyleWarningsTokenMacro}.
     */
    @SuppressWarnings("unchecked")
    public FixedCheckStyleWarningsTokenMacro() {
        super("CHECKSTYLE_FIXED", CheckStyleResultAction.class, CheckStyleMavenResultAction.class);
    }
}

