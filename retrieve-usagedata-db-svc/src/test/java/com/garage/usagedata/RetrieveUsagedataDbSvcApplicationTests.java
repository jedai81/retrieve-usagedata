package com.garage.usagedata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.garage.usagedata.bean.Data_datasvcdrctlyuseqntlist;
import com.garage.usagedata.bean.Data_useptrn3monsretv;
import com.garage.usagedata.bean.datasvcdrctlyuseqntlist_pk;
import com.garage.usagedata.bean.useptrn3monsretv_pk;
import com.garage.usagedata.repository.datasvcdrctlyuseqntlistRepository;
import com.garage.usagedata.repository.useptrn3monsretvRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetrieveUsagedataDbSvcApplicationTests {
	
	@Autowired
    private datasvcdrctlyuseqntlistRepository datasvcdrctlyuseqntlistRepositoryRepository;
	
	@Autowired
	useptrn3monsretvRepository useptrn3monsretvRepositoryRepository;

    @After
    public void tearDown() throws Exception {
//    	repsitory.deleteAll();
    }


//	@Test
	public void getData_datasvcdrctlyuseqntlistRepositoryRepository() {
		String svccontid = "580095369";
		String retvdt = "20190108";
		
		Data_datasvcdrctlyuseqntlist data = datasvcdrctlyuseqntlistRepositoryRepository.findById(new datasvcdrctlyuseqntlist_pk(svccontid, retvdt)).get();
		
		System.out.println(data.toString());
		System.out.println(data.getProdnm());
        
        
        assertThat(data.getSvccontid()).isEqualTo("580095369");
        assertThat(data.getRetvdt()).isEqualTo("20190108");
	}
	
	@Test
	public void getData_useptrn3monsretvRepositoryRepository() {
		String svccontid = "680350947";
		String retvym = "201811";
		
		Data_useptrn3monsretv data = useptrn3monsretvRepositoryRepository.findById(new useptrn3monsretv_pk(svccontid, retvym)).get();
		
		System.out.println(data.toString());
		System.out.println(data.getNtnlvctlktotqnt());
		
		
		assertThat(data.getSvccontid()).isEqualTo("680350947");
        assertThat(data.getRetvym()).isEqualTo("201811");
	}
}

