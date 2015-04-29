import java.util.HashMap;
import java.util.Map;


//Em java as classesnao podem ser static, execpto se dentro de outras classes
//Contudo os membros podem ser static.
//Se a classe nao tiver um construtor, por defeito privado,podemos criar objectos.
//Neste caso todos os membros static sao partilhados pelos obectos ou seja se tiver um numero 10 num objecto, tera 10 em todos os objectos.
//Se a class tiver um construtor private, nao pode ser instanciada

public class Globais {
	
	public static Map<Integer,String> d = new HashMap<Integer,String>();

}
