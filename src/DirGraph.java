import java.util.Set;
import java.util.stream.Collectors;

public class DirGraph<T> extends Graph<T>{
    @Override
    public void addEdge(T srcData, T destData){
        Vertex srcVertex = getVertex(srcData);
        Vertex destVertex = getVertex(destData);
        if(srcVertex ==null || destVertex==null){
            throw new RuntimeException("no vertex");
        }
        srcVertex.addEdge(destVertex);

    }

    public Set<Vertex> getInVertices(Vertex vertex){
        Set<Vertex> collect = this.vertices.stream().filter(v -> {
            boolean b = v.isNeighbor(vertex);
            return b;
        }).collect(Collectors.toSet());
        return collect;
    }

    public Set<Vertex> getInVertices(T data){
        Set<Vertex> inVertices = getInVertices(getVertex(data));
        return inVertices;
    }
}
