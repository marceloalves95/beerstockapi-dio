package br.com.beerstockapidio.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author RubioAlves
 * Created 19/08/2021 at 10:23
 */
@Getter
@AllArgsConstructor
public enum BeerType {

    LAGER("Lager"),
    MALZBIER("Malzbier"),
    WITBIER("Witbier"),
    WEISS("Weiss"),
    ALE("Ale"),
    IPA("IPA"),
    STOUT("Stout");

    private final String description;

}
