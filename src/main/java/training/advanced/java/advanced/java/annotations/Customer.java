package training.advanced.java.advanced.java.annotations;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import training.advanced.java.advanced.java.enums.EGender;


@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long custId;
    // @Column(name = "isim")
    private String name;
    private String surname;
    private EGender gender = EGender.FEMALE;
    private Integer age;
    private Integer height;
    private Integer weight;

    public Customer() {
    }

    @Builder(setterPrefix = "with")
    public Customer(final String nameParam,
                    final String surnameParam,
                    final EGender genderParam,
                    final Integer ageParam,
                    final Integer heightParam,
                    final Integer weightParam) {
        name = nameParam;
        surname = surnameParam;
        gender = genderParam;
        age = ageParam;
        height = heightParam;
        weight = weightParam;
    }


    public static void main(String[] args) {
        Customer customerLoc = new Customer();
        customerLoc.setName("ali");
        customerLoc.setSurname("temurtaş");
        if (args != null && args.length == 1) {
            System.out.println("deneme");
        }
        customerLoc.setGender(EGender.MALE);

        Customer customerLoc2 = Customer.builder()
                .withNameParam("ali")
                .withSurnameParam("temurtaş")
                .withGenderParam(EGender.MALE)
                .build();

    }
}
