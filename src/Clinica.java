import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class Clinica {
    private PriorityQueue<Paciente> colaPacientes;
    public Clinica(){
        colaPacientes = new PriorityQueue<>();
    }
    public void encolar(Paciente p){
        colaPacientes.add(p);
    }

    public Paciente desencolar() throws Exception {
        if(colaPacientes.isEmpty())
            throw new Exception("No hay elementos");
        return colaPacientes.poll();
    }

    public ArrayList<Paciente> listarPacientes(){
        return new ArrayList<>(colaPacientes);
    }
}
