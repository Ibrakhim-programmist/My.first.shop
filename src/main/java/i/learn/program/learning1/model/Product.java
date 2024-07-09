package i.learn.program.learning1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
   private Long id;
   private String name;
   private double price;
   private int amount;
   private String url;
   private String description;
   private String image;
}


