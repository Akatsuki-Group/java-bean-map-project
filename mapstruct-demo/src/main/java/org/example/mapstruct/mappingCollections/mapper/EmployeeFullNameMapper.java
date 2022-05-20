package org.example.mapstruct.mappingCollections.mapper;

import org.example.mapstruct.mappingCollections.dto.EmployeeFullNameDTO;
import org.example.mapstruct.mappingCollections.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EmployeeFullNameMapper {

    List<EmployeeFullNameDTO> map(List<Employee> employees);

    default EmployeeFullNameDTO map(Employee employee) {
        EmployeeFullNameDTO employeeInfoDTO = new EmployeeFullNameDTO();
        employeeInfoDTO.setFullName(employee.getFirstName() + " " + employee.getLastName());

        return employeeInfoDTO;
    }
}
