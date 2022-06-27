# Study Buddy Backend
 ## *The Annotations used for Java in IntelliJ*
   ### **@Autowired**
    Spring provides annotation-based auto-wiring by providing @Autowired annotation. It is used to autowire spring beans on setter methods, instance variables, and constructor. When we use @Autowired annotation, the spring container auto-wires the bean by matching data-type.
  ### **@AllArgsConstructor**
    Generates an all-args constructor. An all-args constructor requires one argument for every field in the class.
  ### **@RestController**
     It can be considered as a combination of @Controllerand @ResponseBody annotations. The @RestController annotation is itself annotated with the @ResponseBody annotation. It eliminates the need for annotating each method with @ResponseBody.
### **@Data**
     It is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
### **@NoArgsConstructor** 
     The @NoArgsConstructor annotation is used to generate the no-argument constructor for a class. In this case, the class consists of final fields. Using this annotation makes the compiler throw a compile-time error. To overcome this, the annotation takes a parameter called force which, when set to be true, initializes the final fields 0 or false or null.
### **@Entity**      
@Entity annotation defines that a class can be mapped to a table. And that is it, it is just a marker, like for example Serializable interface.

 ### *Login*
 http://localhost:4200/login
     
 ### *Register* 
 http://localhost:4200/register
 
 ### *Timer*
  
 ### *Sets*
 
 ### *Flashcards*
 
 ### *Notes*
 
 Notes: 
     
     
 
