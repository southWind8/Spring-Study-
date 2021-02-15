package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description TODO
 * @Author
 * @Date 2021/2/9
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Component
/**
 * 说明这个类被spring接管了，注册到了容器中
 */
public class User {
    private String name;
}
