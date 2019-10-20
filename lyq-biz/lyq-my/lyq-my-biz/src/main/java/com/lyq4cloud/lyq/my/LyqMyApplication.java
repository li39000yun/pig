/*
 *  Copyright (c) 2019-2020, 冷冷 (wangiegie@gmail.com).
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lyq4cloud.lyq.my;


import com.pig4cloud.pig.common.security.annotation.EnablePigFeignClients;
import com.pig4cloud.pig.common.security.annotation.EnablePigResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyq
 * @date 2019年10月19日
 * 个人系统
 */
@EnablePigResourceServer
@EnablePigFeignClients
@SpringCloudApplication
@RestController
public class LyqMyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyqMyApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello " + name + " 我是my";
    }

}
