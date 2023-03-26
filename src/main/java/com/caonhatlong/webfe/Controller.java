package com.caonhatlong.webfe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class Controller {

    private List<Product> data(){
        List<Product> products = new ArrayList<>();
        List<String> imgUrls = new ArrayList<>();
        imgUrls.add("assets/images/footer1.jpg");
        imgUrls.add("assets/images/footer2.jpg");
        imgUrls.add("assets/images/footer3.jpg");
        imgUrls.add("assets/images/footer4.jpg");
        imgUrls.add("assets/images/product1.png");
        imgUrls.add("assets/images/product2.gif");
        imgUrls.add("assets/images/product3.gif");
        imgUrls.add("assets/images/product4.gif");
        products.add(new Product().setId(1)
                .setName("Product1")
                .setKt("3x3")
                .setDes("Awning windows can be a good option for hurricane-safe windows because they are designed to withstand high winds and heavy rain. These windows feature a top-hinged sash that swings outward and upward, allowing for ventilation while keeping the rain out. When it comes to hurricane safety, there are several features that you should look for in awning windows. Firstly, the windows should be made from impact-resistant glass that can withstand flying debris and high winds. Additionally, the windows should be installed using a strong frame and reinforced with steel or aluminum bars to prevent them from being blown in or out during a storm. Some awning windows also feature a multi-point locking system that provides extra security and helps to keep the window firmly in place during high winds. It's also important to look for windows that meet local building codes and are certified for hurricane safety. When selecting hurricane-safe awning windows, it's a good idea to work with a reputable window manufacturer or contractor who can help you choose" +
                        " the right products for your specific needs and ensure tha" +
                        "t they are installed correctly to maximize their safe" +
                        "ty and effectiveness during a storm.")
                .setUrlImages(imgUrls)
                .setImgTitle("assets/images/footer1.jpg"));
        products.add(new Product().setId(2)
                .setName("Product1")
                .setKt("3x3")
                .setDes("Awning windows can be a good option for hurricane-safe windows because they are designed to withstand high winds and heavy rain. These windows feature a top-hinged sash that swings outward and upward, allowing for ventilation while keeping the rain out. When it comes to hurricane safety, there are several features that you should look for in awning windows. Firstly, the windows should be made from impact-resistant glass that can withstand flying debris and high winds. Additionally, the windows should be installed using a strong frame and reinforced with steel or aluminum bars to prevent them from being blown in or out during a storm. Some awning windows also feature a multi-point locking system that provides extra security and helps to keep the window firmly in place during high winds. It's also important to look for windows that meet local building codes and are certified for hurricane safety. When selecting hurricane-safe awning windows, it's a good idea to work with a reputable window manufacturer or contractor who can help you choose" +
                        " the right products for your specific needs and ensure tha" +
                        "t they are installed correctly to maximize their safe" +
                        "ty and effectiveness during a storm.")
                .setUrlImages(imgUrls)
                .setImgTitle("assets/images/footer1.jpg"));
        products.add(new Product().setId(3)
                .setName("Product1")
                .setKt("3x3")
                .setDes("Awning windows can be a good option for hurricane-safe windows because they are designed to withstand high winds and heavy rain. These windows feature a top-hinged sash that swings outward and upward, allowing for ventilation while keeping the rain out. When it comes to hurricane safety, there are several features that you should look for in awning windows. Firstly, the windows should be made from impact-resistant glass that can withstand flying debris and high winds. Additionally, the windows should be installed using a strong frame and reinforced with steel or aluminum bars to prevent them from being blown in or out during a storm. Some awning windows also feature a multi-point locking system that provides extra security and helps to keep the window firmly in place during high winds. It's also important to look for windows that meet local building codes and are certified for hurricane safety. When selecting hurricane-safe awning windows, it's a good idea to work with a reputable window manufacturer or contractor who can help you choose" +
                        " the right products for your specific needs and ensure tha" +
                        "t they are installed correctly to maximize their safe" +
                        "ty and effectiveness during a storm.")
                .setUrlImages(imgUrls)
                .setImgTitle("assets/images/footer1.jpg"));
        products.add(new Product().setId(4)
                .setName("Product1")
                .setKt("3x3")
                .setDes("Awning windows can be a good option for hurricane-safe windows because they are designed to withstand high winds and heavy rain. These windows feature a top-hinged sash that swings outward and upward, allowing for ventilation while keeping the rain out. When it comes to hurricane safety, there are several features that you should look for in awning windows. Firstly, the windows should be made from impact-resistant glass that can withstand flying debris and high winds. Additionally, the windows should be installed using a strong frame and reinforced with steel or aluminum bars to prevent them from being blown in or out during a storm. Some awning windows also feature a multi-point locking system that provides extra security and helps to keep the window firmly in place during high winds. It's also important to look for windows that meet local building codes and are certified for hurricane safety. When selecting hurricane-safe awning windows, it's a good idea to work with a reputable window manufacturer or contractor who can help you choose" +
                        " the right products for your specific needs and ensure tha" +
                        "t they are installed correctly to maximize their safe" +
                        "ty and effectiveness during a storm.")
                .setUrlImages(imgUrls)
                .setImgTitle("assets/images/footer1.jpg"));
        products.add(new Product().setId(4)
                .setName("Product1")
                .setKt("3x3")
                .setDes("Awning windows can be a good option for hurricane-safe windows because they are designed to withstand high winds and heavy rain. These windows feature a top-hinged sash that swings outward and upward, allowing for ventilation while keeping the rain out. When it comes to hurricane safety, there are several features that you should look for in awning windows. Firstly, the windows should be made from impact-resistant glass that can withstand flying debris and high winds. Additionally, the windows should be installed using a strong frame and reinforced with steel or aluminum bars to prevent them from being blown in or out during a storm. Some awning windows also feature a multi-point locking system that provides extra security and helps to keep the window firmly in place during high winds. It's also important to look for windows that meet local building codes and are certified for hurricane safety. When selecting hurricane-safe awning windows, it's a good idea to work with a reputable window manufacturer or contractor who can help you choose" +
                        " the right products for your specific needs and ensure tha" +
                        "t they are installed correctly to maximize their safe" +
                        "ty and effectiveness during a storm.")
                .setUrlImages(imgUrls)
                .setImgTitle("assets/images/footer1.jpg"));
        products.add(new Product().setId(5)
                .setName("Product1")
                .setKt("3x3")
                .setDes("Awning windows can be a good option for hurricane-safe windows because they are designed to withstand high winds and heavy rain. These windows feature a top-hinged sash that swings outward and upward, allowing for ventilation while keeping the rain out. When it comes to hurricane safety, there are several features that you should look for in awning windows. Firstly, the windows should be made from impact-resistant glass that can withstand flying debris and high winds. Additionally, the windows should be installed using a strong frame and reinforced with steel or aluminum bars to prevent them from being blown in or out during a storm. Some awning windows also feature a multi-point locking system that provides extra security and helps to keep the window firmly in place during high winds. It's also important to look for windows that meet local building codes and are certified for hurricane safety. When selecting hurricane-safe awning windows, it's a good idea to work with a reputable window manufacturer or contractor who can help you choose" +
                        " the right products for your specific needs and ensure tha" +
                        "t they are installed correctly to maximize their safe" +
                        "ty and effectiveness during a storm.")
                .setUrlImages(imgUrls)
                .setImgTitle("assets/images/footer1.jpg"));
        products.add(new Product().setId(7)
                .setName("Product1")
                .setKt("3x3")
                .setDes("Awning windows can be a good option for hurricane-safe windows because they are designed to withstand high winds and heavy rain. These windows feature a top-hinged sash that swings outward and upward, allowing for ventilation while keeping the rain out. When it comes to hurricane safety, there are several features that you should look for in awning windows. Firstly, the windows should be made from impact-resistant glass that can withstand flying debris and high winds. Additionally, the windows should be installed using a strong frame and reinforced with steel or aluminum bars to prevent them from being blown in or out during a storm. Some awning windows also feature a multi-point locking system that provides extra security and helps to keep the window firmly in place during high winds. It's also important to look for windows that meet local building codes and are certified for hurricane safety. When selecting hurricane-safe awning windows, it's a good idea to work with a reputable window manufacturer or contractor who can help you choose" +
                        " the right products for your specific needs and ensure tha" +
                        "t they are installed correctly to maximize their safe" +
                        "ty and effectiveness during a storm.")
                .setUrlImages(imgUrls)
                .setImgTitle("assets/images/footer1.jpg"));
        return products;
    }

    @GetMapping
    public List<Product> getAll(){
        return data();
    }

    @GetMapping("/get/{id}")
    public Product getById(@PathVariable Integer id){
        var filters = data().stream().filter(p -> Objects.equals(p.getId(), id)).collect(Collectors.toList());
        return filters.stream().findFirst().get();
    }
}
