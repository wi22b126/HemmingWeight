package at.technikum.hemmingweight;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HemmingController {


    @RequestMapping("/hemming")
    public static int calculateHammingWeight(@RequestParam String inputString) {
        int hammingWeight = 0;
        for (char c : inputString.toCharArray()) {
            if (c != '0') {
                hammingWeight++;
            }
        }
        return hammingWeight;
    }
}


