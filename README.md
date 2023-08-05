# ExamApp_05.08.2023

1. What is the purpose of the ViewHolder pattern in Android?

    List tipində olan layoutlarda single itemi saxlamaq və render etmək üçün istifadə olunur
    Hər scrollda ViewHolder inner classı FindViewById funksiyası ilə viewları tapır

2. How do you handle exceptions in kotlin ? Provide an example of a try-catch block for handling a potential exception in your code.

  var a = 5 
  var b = 0 
     try {
         a = a / b 
        // some code
   }

    catch(e: Exception) {
       println("Exception handled")
   }
Yuxarıdakı kod nümunəsində öncə 0-a bölmə try ilə yoxlanır, lakin bu əməliyyat mümkün deyil deyə catch blokuna keçir, catchdə yazılan əməliyyat icra olunur.

3. What are Decorative Patterns , and why are they useful ? Demonstrate how you can use Decorative Patterns in Kotlin to add functionality to existing classes.

Decorative Patternlər hər class üçün zəruri olan interfacelə yanaşı sadəcə müəyyən classlar üçün lazımlı olan methodları göstərmək üçün istifadə olunur. 
Məsələn bir class özündə bir interfaceə istinad edən method və bir başqa method saxlaya bilir.  
Kod hissəsi theoryquestion packageində yazılıb.

5. What is the purpose of the “let” keyword in Kotlin , give example.

   Let açar sözü null safe əməliyyatlar icra etmək üçün istifadə olunur. 
    Kod hissəsi theoryquestion packageində yazılıb.

6. Which of the principle (SOLID) is violated in example ?

   Liskov susbstitution pozulub. Çünki hər bir child parenti replace edə bilməlidir.

7. How can we declare static variables in Kotlin ?
      Static dəyişənlər həm class daxilində yazılan companion objectlə həm də classdan kənar objectlərlə  (singleton) declare oluna bilir.

8. What is Constructors ? How many types of constructors do you know in Kotlin?
    Konstruktor klassa göndərilmiş variable üzərində əməlliyyat aparmaq üçün spesifik methoddur.
   iki tip constructor var: primary və secondary
   Primary maksimum 1 ədəd olur, secondary isə 1dən daha artıq ola bilər.

9. Explain Usage of Factory Patterns in Kotlin , why do we need it ?

    Factory patternində bir interfacedə lazimi methodlar göstərilir, daha sonra hər enum dəyişəni özünə uyğun klassı çağırır bu klasslarda interfacedəki method
   override olunur.

10. Implement a HouseFactory class that provides methods for creating different types of houses (Cottage , Villa ,Mansion). Each house type should have its own specific features.
    Null

11. Livedata observe olunacaq datanı özündə saxlayır, hər dəfə api call olunmasının qarşısı alınır
12. MVP - Model Viev və Presenter var, presenter həm Uİ həmdə həm də modeli update edə bilir
13. Kod hissəsində var
14. Singleton yalnız bir objecti olan classdır. Elə obeject ad kimi implement olunur. Companion obejectlə eyni məntiqlə işləyir, statikdir.
15. theroyquestionsda var

  
   
   
