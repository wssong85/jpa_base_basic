package advancedmapping;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorColumn
// 테이블마다 독립 생성은 일단 고려 x
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// 1. 큰 기능이 아닐 경우 SINGLE_TABLE
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// 2. 비지니스 적으로 큰 범위 JOINED
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int price;
}
