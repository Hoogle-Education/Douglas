package br.com.douglas.fragmentos.dao.interfaces;

import java.util.List;
import java.util.Optional;

import br.com.douglas.fragmentos.model.Fragmento;

public interface FragmentoDao {
	
	void save(Fragmento obj);
	void update(Fragmento obj);
	void deleteByGroupId(Integer groupId);
	List<Fragmento> reorganize();
	Optional<Fragmento> findByGroupId(Integer groupId);
	List<Fragmento> findAll();

}
