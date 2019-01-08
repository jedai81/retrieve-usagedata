package com.garage.usagedata;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.garage.usagedata.bean.UsageData;
import com.garage.usagedata.repository.UsageDataRedisRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetrieveUsagedataSvcApplicationTests {

	@Autowired
    private UsageDataRedisRepository usageDataRedisRepository;

    @After
    public void tearDown() throws Exception {
    	usageDataRedisRepository.deleteAll();
    }

    @Test
    public void 기본_등록_조회기능() {
        //given
        String svcNo = "01029050326";
        LocalDateTime refreshTime = LocalDateTime.of(2019, 1, 8, 14, 50);
        UsageData usageData = new UsageData(svcNo, "12345", refreshTime);

        //when
        usageDataRedisRepository.save(usageData);

        //then
        UsageData savedUsageData = usageDataRedisRepository.findById(svcNo).get();
        
        System.out.println(savedUsageData.toString());
        
        
        assertThat(savedUsageData.getUsageData()).isEqualTo("12345");
        assertThat(savedUsageData.getRefreshTime()).isEqualTo(refreshTime);
    }

}

