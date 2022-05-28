package one.digitalinovation.personapi.utils;

import one.digitalinovation.personapi.dto.request.PhoneDTO;
import one.digitalinovation.personapi.entity.Phone;
import one.digitalinovation.personapi.enums.PhoneType;

public class PhoneUtils {

    public static final String PHONE_NUMBER = "1199999-9999";
    public static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    public static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
