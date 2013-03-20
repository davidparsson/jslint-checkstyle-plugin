package hudson.plugins.jslint;

import hudson.model.AbstractBuild;
import hudson.plugins.analysis.core.BuildHistory;
import hudson.plugins.analysis.core.ParserResult;
import hudson.plugins.analysis.test.BuildResultTest;
import hudson.plugins.jslint.CheckStyleResult;

/**
 * Tests the class {@link CheckStyleResult}.
 */
public class CheckstyleResultTest extends BuildResultTest<CheckStyleResult> {
    @Override
    protected CheckStyleResult createBuildResult(final AbstractBuild<?, ?> build, final ParserResult project, final BuildHistory history) {
        return new CheckStyleResult(build, history, project, "UTF8", false);
    }
}

