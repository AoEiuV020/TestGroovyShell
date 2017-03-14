package aoeiuv020
import java.nio.file.*;
/**
 * @author AoEiuV020
 * @version 1.0 , 2017/03/14
 */
class Main{
	static void main(def args)throws Exception{
		URL url=this.classLoader.getResource("hello")
		def sHello=url.text
		println sHello
		GroovyShell gs=new GroovyShell()
		def ret=gs.evaluate(sHello)
		println ret
	}
}

