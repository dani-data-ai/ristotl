package ai.chat2db.plugin.lineage;

import java.util.List;

public class LineageGraph {
    private List<LineageNode> nodes;
    private List<LineageEdge> edges;

    public LineageGraph(List<LineageNode> nodes, List<LineageEdge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<LineageNode> getNodes() {
        return nodes;
    }

    public List<LineageEdge> getEdges() {
        return edges;
    }
}