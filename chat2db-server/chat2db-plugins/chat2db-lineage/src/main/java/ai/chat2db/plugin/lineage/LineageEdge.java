package ai.chat2db.plugin.lineage;

public class LineageEdge {
    private String fromNodeName;
    private String toNodeName;
    private String relationshipType;

    public LineageEdge(String fromNodeName, String toNodeName, String relationshipType) {
        this.fromNodeName = fromNodeName;
        this.toNodeName = toNodeName;
        this.relationshipType = relationshipType;
    }

    public String getFromNodeName() {
        return fromNodeName;
    }

    public String getToNodeName() {
        return toNodeName;
    }

    public String getRelationshipType() {
        return relationshipType;
    }
}