package br.com.beerstockapidio.mapper;

import br.com.beerstockapidio.dto.BeerDTO;
import br.com.beerstockapidio.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
