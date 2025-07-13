package ai.chat2db.plugin.lineage;

public class LineageConfig {
    private boolean enabled = true;
    private String analysisMode = "STATIC";
    private int maxDepth = 5;
    private boolean cacheResults = true;
    private String logging = "INFO";

    public static LineageConfig load() {
        // TODO: load from YAML or properties.
        return new LineageConfig();
    }

    public boolean isEnabled() { return enabled; }
    public String getAnalysisMode() { return analysisMode; }
    public int getMaxDepth() { return maxDepth; }
    public boolean isCacheResults() { return cacheResults; }
    public String getLogging() { return logging; }
}