/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author savits
 */
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class Client {
     public static void main(String args[])
     {
    Resource resource=new FileSystemResource("SpringTeamPlayer/src/player-team.xml");
    BeanFactory factory=new XmlBeanFactory(resource);
    
    Team india=(Team)factory.getBean("india");
    System.out.println(india);

    Player tendulkar=(Player)factory.getBean("tendulkar");
    System.out.println(tendulkar);

      Player dravid=(Player)factory.getBean("dravid");
    System.out.println(dravid);

      Player ganguly=(Player)factory.getBean("ganguly");
    System.out.println(ganguly);
    


     }

}
