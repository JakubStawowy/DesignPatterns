package Iterator;

import java.util.Arrays;
import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer>[] adjacencyList;
    public AbstractGraphIterator getIterator(){
        return new GraphIterator(adjacencyList);
    }
    public Graph(int index){
        adjacencyList = new LinkedList[index];
        for (int i = 0; i < adjacencyList.length; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }
    public void addNode(int a, int b){
        adjacencyList[a].add(b);
        adjacencyList[b].add(a);
    }
}
interface AbstractGraphIterator{
    boolean hasNext();
    Integer next();
    void setPointer(int pointer);
    void setPointer();
}
class GraphIterator implements AbstractGraphIterator{

    private LinkedList<Integer>[] adjacenyList;
    private boolean[] visited;
    private LinkedList<Integer> queue = new LinkedList<>();
    public GraphIterator(LinkedList<Integer>[] adjacenyList){
        this.adjacenyList = adjacenyList;
        visited = new boolean[adjacenyList.length];
//        queue.add(0);
//        visited[0] = true;
        setPointer();
    }
    @Override
    public void setPointer(int pointer){
        queue.clear();
        Arrays.fill(visited, false);
        queue.add(pointer);
        visited[pointer] = true;
    }

    @Override
    public void setPointer() {
        for (int i = 0; i < adjacenyList.length; i++) {
            if(adjacenyList[i].size()!=0){
                queue.add(i);
                visited[i] = true;
                break;
            }
            else visited[i] = false;
        }
    }

    @Override
    public boolean hasNext() {
        return queue.size() != 0;
    }

    @Override
    public Integer next() {
        Integer next = queue.get(0);
        for(Integer i: adjacenyList[next])
            if(!visited[i]){
                queue.add(i);
                visited[i] = true;
            }
        queue.poll();
        return next;
    }
}
class Main{
    public static void main(String[] args){
        Graph graph = new Graph(6);

        graph.addNode(0,1);
        graph.addNode(0,3);
        graph.addNode(1,2);
        graph.addNode(1,4);
        graph.addNode(3,4);
        AbstractGraphIterator it = graph.getIterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\n---------------------");
        it.setPointer(4);
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
