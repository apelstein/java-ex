import java.util.*;
import java.util.function.Predicate;

public class Graph <T>{

    Set<Vertex> vertices;

    public Graph(){
        vertices = new HashSet<>();
    }

    public Graph(Collection<Vertex> collection){
        vertices = new HashSet<>(collection);
    }

    public Graph(List<T> data){
        this((List<Vertex>) data.stream().map(t->new Vertex<T>(t)));

    }

    public void addVertex(Vertex v){
        vertices.add(v);
    }

    public void addVertex(T data){
        vertices.add(new Vertex(data));
    }

    public void addEdge(T srcData, T destData){
        Vertex srcVertex = getVertex(srcData);
        Vertex destVertex = getVertex(destData);
        if(srcVertex ==null || destVertex==null){
            throw new RuntimeException("no vertex");
        }
        srcVertex.addEdge(destVertex);
        destVertex.addEdge(srcVertex);

    }

    public Vertex getVertex(T data){
        return vertices.stream().filter(v->v.equalsToData(data)).findFirst().orElse(null);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        vertices.forEach(v->{
            stringBuilder.append(v + ": ");
            v.neighbors.forEach(n->stringBuilder.append(n + ", "));
            stringBuilder.append("\n");
        });
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
