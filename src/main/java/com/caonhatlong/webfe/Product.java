package com.caonhatlong.webfe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Product {

    private Integer id;

    private String name;

    private String des;

    private String kt;

    private String color;

    private String imgTitle;

    private List<String> urlImages;
}
