package roomescape.model.repository;

import org.springframework.stereotype.Repository;
import roomescape.model.MemberDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberRepository {
    private static int id = 0;
    private static final Map<Integer, MemberDTO> reservationStore = new HashMap<>();

    public MemberDTO MemberAdd(MemberDTO memberDTO, String name, String date, String time) {
        memberDTO.setId(++id);
        memberDTO.setName(name);
        memberDTO.setDate(date);
        memberDTO.setTime(time);
        reservationStore.put(memberDTO.getId(), memberDTO);
        return memberDTO;
    }

    public List<MemberDTO> findAll() {
        return new ArrayList<>(reservationStore.values());
    }
}