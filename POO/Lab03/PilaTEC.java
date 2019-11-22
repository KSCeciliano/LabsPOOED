/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
import java.util.ArrayList;

public class PilaTEC<Object> extends ArrayList<Object> {

    public int getSize() {
        return this.size();
    }

    public Object peek() {
        return this.get(getSize() - 1);
    }

    public Object pop() {
        Object o = this.get(getSize() - 1); this.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        this.add(o);
    }

    public String getString(){
        String str = "PilaTEC:  \n";
        for(int i = this.size() - 1; i >= 0; i--){
            str += this.get(i)+"\n";
        }
        return str;
    }
}
