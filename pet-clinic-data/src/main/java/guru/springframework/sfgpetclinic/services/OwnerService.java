package guru.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;

@Service
public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
	
}
