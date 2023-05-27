package monaj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class yunus {

	public static void main(String[] args) {
		 Resource rs = new ClassPathResource("bhrath.xml");
			
			BeanFactory bn  = new XmlBeanFactory(rs);
			revanth emp = (revanth)bn.getBean("emp");
			
			emp.disp();
	}

}
