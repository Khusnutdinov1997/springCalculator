package pro.sky.springCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final ServiceCalculator serviceCalculator;

    public  CalculatorController(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping("/calculator")
    public String welcom() {
      return serviceCalculator.welcom();
    }

    @GetMapping("/calculator/plus")
    public String plus (@RequestParam (name = "num1") Integer num1,
                         @RequestParam(name = "num2") Integer num2) {
        int plus = serviceCalculator.plus(num1, num2);
        return num1 + "+" + num2 + "=" + plus;
    }

    @GetMapping("/calculator/minus")
    public String minus (@RequestParam (name = "num1") Integer num1,
                         @RequestParam(name = "num2") Integer num2) {
            int minus = serviceCalculator.minus(num1, num2);
            return num1 + "-" + num2 + "=" + minus;
        }

    @GetMapping("/calculator/multiply")
    public String multiply (@RequestParam (name = "num1") Integer num1,
                         @RequestParam(name = "num2") Integer num2){
                int multiply = serviceCalculator.multiply(num1, num2);
                return num1 + "*" + num2 + "=" + multiply;
            }

    @GetMapping("/calculator/divide")
    public String divide (@RequestParam (name = "num1") Integer num1,
                         @RequestParam(name = "num2") Integer num2) {
        if(num2 == 0) return "На ноль делить нельзя";
        int divide = serviceCalculator.divide(num1, num2);
        return num1 + "/" + num2 + "=" + divide;

    }
}
