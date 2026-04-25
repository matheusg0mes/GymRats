package br.com.projeto.projeto.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MapperObejct {

    public static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O, D> D parserObject(O origin ,Class<D> destination){
        return mapper.map(origin,destination);
    }

    public static <O, D> List<D> parserObject(List<O> origin , Class<D> destination){
        List<D> destino = new ArrayList<D>();

        for(Object os : origin){
            destino.add(mapper.map(os,destination));
        }
        return destino;
    }
}
