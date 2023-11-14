package org.delivery.db;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
// 일반적으로, 상속 관계 매핑 전략에서 부모 클래스와 자식 클래스 모두 데이터베이스 테이블과 매핑을 한다. 이와 달리, 부모 클래스를 상속받는 자식 클래스에게 매핑 정보만 제공하고 싶을 때 이 어노테이션을 사용하면 된다.
@Data

@SuperBuilder
// 슈퍼 빌더는 부모가 가지고 있는 변수도 지정할 수 있다.
// 빌더 패턴(Builder Pattern)은 복잡한 객체의 생성 과정과 표현 방법을 분리하여 다양한 구성의 인스턴스를 만드는 생성 패턴이다. 생성자에 들어갈 매개 변수를 메서드로 하나하나 받아들이고 마지막에 통합 빌드해서 객체를 생성하는 방식이다.

public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // id 필드의 타입이 Long으로 정의되어 있는 경우, 데이터베이스 테이블에서 id 열을 bigint 유형으로 매칭되는 것이 권장된다.
    // Long 타입이 Java에서 64비트의 정수 값을 나타내며, 데이터베이스의 'bigint'유형과 호환되기 떄문이다.
}
