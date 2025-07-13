package ai.chat2db.plugin.lineage;

public class LineageNode {
    private String name;
    private String type; // e.g., TABLE, VIEW, PROCEDURE

    public LineageNode(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}