package p7gruppe.p7.offloading.api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;
import p7gruppe.p7.offloading.model.Job;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Controller
public class JobsController implements JobsApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        System.out.println("Got get request");
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Void> jobsPost(@NotNull @Valid Job query) {
        System.out.println("Got post request");
        System.out.println("Received post - id: " + query.getId() + ", name: " + query.getName());
        return null;
    }
}
