import java.util.HashSet;
import java.util.Set;

public class Vertex <T>{
    public Set<Vertex> neighbors;
    public T data;
    public boolean marked;
    public boolean visited;

    public Vertex(T data){
        this.data = data;
        this.neighbors = new HashSet<>();
    }

    @Override
    public String toString(){
        return this.data.toString();
    }

    public void addEdge(Vertex neighbor){
        neighbors.add(neighbor);
    }

    public boolean equalsToData(T data){
        return this.data.equals(data);
    }

    public boolean isNeighbor(Vertex v){
        return isNeighbor((T) v.data);
    }

    public boolean isNeighbor(T candData){
        return neighbors.stream().filter(v->{
            boolean b = v.equalsToData(candData);
            return b;
        }).findFirst().orElse(null) != null;
    }
}
